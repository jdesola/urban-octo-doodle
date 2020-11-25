<template>
  <div class="book-container">
      <book-card v-for="book in allBooks" v-bind:key="book.isbn" v-bind:book="book"/>
  </div>
</template>

<script>
import BookCard from './BookCard.vue'

export default {
  components: { BookCard },
    name: 'reading-list',
    computed: {
      allBooks() { 
        const books = this.$store.state.books;
        return books;
      }
    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>