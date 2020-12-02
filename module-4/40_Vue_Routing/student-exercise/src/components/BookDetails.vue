<template>
  <div class="main">
      <h1>{{ book.title }}</h1>
      <h1>{{ book.author }}</h1>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
      <p v-text="(book.read === false) ? 'I have not read this book' : 'I have read this book'"></p>
  </div>
</template>

<script>
export default {
  name: 'book-details',
computed: {
        book() {
            return this.$store.state.books.find(
                b => {
                    return b.isbn == this.$store.state.activeBook;
                }
            )
        }
    },
    created() {
        const activeBookIsbn = this.$route.params.isbn;
        this.$store.commit('SET_ACTIVE_BOOK', activeBookIsbn);
    }
}
</script>

<style>

</style>