<template>
  <div>
    <h1>{{ title }}</h1>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div class="boards" v-else>
      <board-column
        title="Planned"
        v-bind:cards="planned"
        v-bind:boardID="this.$route.params.id"
      />
      <board-column
        title="In Progress"
        v-bind:cards="inProgress"
        v-bind:boardID="this.$route.params.id"
      />
      <board-column
        title="Completed"
        v-bind:cards="completed"
        v-bind:boardID="this.$route.params.id"
      />
    </div>
    <div class="board-actions" v-if="!isLoading">
      <router-link to="/">Back to Boards</router-link>
    </div>
  </div>
</template>

<script>
import BoardColumn from '@/components/BoardColumn';
import boardService from '@/services/BoardService';

export default {
  name: 'cards-list',
  components: {
    BoardColumn
  },
  data() {
    return {
      title: '',
      cards: [],
      isLoading: true
    };
  },
  computed: {
    planned() {
      return this.cards.filter(card => card.status === 'Planned');
    },
    inProgress() {
      return this.cards.filter(card => card.status === 'In Progress');
    },
    completed() {
      return this.cards.filter(card => card.status === 'Completed');
    }
  },
  created() {
    const boardId = this.$route.params.id;
    boardService.getCards( boardId ).then( response => {
      this.title = response.data.title;
      this.cards = response.data.cards;
      this.isLoading = false;
    })
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
</style>
