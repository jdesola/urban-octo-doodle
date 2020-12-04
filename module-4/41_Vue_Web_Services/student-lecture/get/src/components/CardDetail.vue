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

export default {
  name: "card-detail",
  data() {
    return {
      card: {
        title:  '',
        description: '',
        status: '',
        comments: []
      }
    }
  },
  created() {
    const boardId = this.$route.params.boardId;
    const cardId = this.$route.params.cardId;
    boardService.getCard(boardId, cardId).then ( data => {
      this.card = data;
    })
  }
};
</script>
