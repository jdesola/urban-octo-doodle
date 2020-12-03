<template>
  <div>


    <h1>{{ card.title }}</h1>
    <p>{{ card.description }}</p>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <comments-list v-bind:comments="card.comments" v-else />
  </div>
</template>

<script>
import boardService from '@/services/BoardService';
import CommentsList from './CommentsList';

export default {
  name: "card-detail",
  components: {
    CommentsList
  },
  data() {
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      },
      isLoading: true
    }
  },
  created() {
    const boardId = this.$route.params.boardID;
    const cardId = this.$route.params.cardID;
    boardService.getCard(boardId, cardId).then( data => {
      this.card = data;
      this.isLoading = false;
      
    })
    

  }
};
</script>
