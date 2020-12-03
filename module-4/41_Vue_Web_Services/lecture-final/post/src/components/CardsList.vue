<template>
  <div>
    <div class="header">
      <h1>{{ title }}</h1>
      <router-link
        tag="button"
        class="btn addNewCard"
        :to="{ name: 'AddCard', params: {boardID: this.boardId} }"
        v-if="!isLoading"
      >Add New Card</router-link>
      <button
        class="btn btn-cancel deleteBoard"
        v-if="!isLoading"
        v-on:click="deleteBoard"
      >Delete Board</button>
    </div>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <div class="status-message error" v-show="errorMsg !== ''">{{errorMsg}}</div>
      <div class="boards">
        <board-column title="Planned" :cards="planned" :boardID="this.boardId" />
        <board-column title="In Progress" :cards="inProgress" :boardID="this.boardId" />
        <board-column title="Completed" :cards="completed" :boardID="this.boardId" />
      </div>
    </div>
    <div class="board-actions" v-if="!isLoading">
      <router-link to="/">Back to Boards</router-link>
    </div>
  </div>
</template>

<script>
import boardsService from "../services/BoardService";
import BoardColumn from "@/components/BoardColumn";

export default {
  name: "cards-list",
  components: {
    BoardColumn
  },
  data() {
    return {
      title: "",
      boardId: 0,
      isLoading: true,
      errorMsg: ""
    };
  },
  methods: {
    retrieveCards() {
      boardsService
        .getCards(this.boardId)
        .then(response => {
          this.title = response.data.title;
          this.$store.commit("SET_BOARD_CARDS", response.data.cards);
          this.isLoading = false;
        })
        .catch(error => {
          if (error.response && error.response.status === 404) {
            alert(
              "Board cards not available. This board may have been deleted or you have entered an invalid board ID."
            );
            this.$router.push("/");
          }
        });
    },
    deleteBoard() {
      // Confirm with the user
      // call the delete API
      // Promise Fullfilled
        // Is status 200
          // inform the user
          // remove the board from VueX store
          // redirect the user to the home page
      // Promise Rejected
        // the user  (Response - 4xx/5xx, Request - can't connect, code)

      if ( confirm("Are you sure you want to delete this board?") ) {
        boardsService.deleteBoard(this.boardId)
          .then( response => {
            if (response.status == 200) {
              alert("Board deleted successfully");
              this.$store.commit('DELETE_BOARD', this.boardId);
              this.$router.push("/");
            }
          })
          .catch( error => {
            if (error.response) {
              this.errorMsg = `Error deleting board.  ${error.response.status} - ${error.response.statusText}`;
            } else if (error.request) {
              this.errorMsg= 'Could not conect to server';
            } else {
              this.errorMsg = 'Unexpected error';
              console.error(error);
            }
          });
      }
    }
  },
  created() {
    this.boardId = this.$route.params.id;
    this.retrieveCards();
  },
  computed: {
    planned() {
      return this.$store.state.boardCards.filter(
        card => card.status === "Planned"
      );
    },
    inProgress() {
      return this.$store.state.boardCards.filter(
        card => card.status === "In Progress"
      );
    },
    completed() {
      return this.$store.state.boardCards.filter(
        card => card.status === "Completed"
      );
    }
  }
};
</script>

<style>
.boards {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-gap: 20px;
}
.board-actions {
  text-align: center;
  padding: 20px 0;
}
.board-actions a:link,
.board-actions a:visited {
  color: blue;
  text-decoration: none;
}
.board-actions a:hover {
  text-decoration: underline;
}
.btn.addNewCard {
  color: #fff;
  background-color: #508ca8;
  border-color: #508ca8;
}
.header {
  display: flex;
  align-items: center;
}
.header h1 {
  flex-grow: 1;
}
</style>
