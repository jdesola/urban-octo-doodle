<template>
    <div class="NewBookForm">
        <form class="new-book-form">
            <label for="title">Title:</label>
            <input id="title" type="text" class="title-input" v-model="newBook.title" />

            <label for="author">Author:</label>
            <input id="author" type="text" class="author-input" v-model="newBook.author" />

            <label for="isbn">ISBN:</label>
            <input id="isbn" type="text" class="isbn-input" v-model="newBook.isbn" />

            <button v-on:click.prevent='addBook'>Add Book</button>
        </form>
    </div>
</template>

<script>
export default {
    name: 'new-book-form',
    data() {
        return {
            newBook: {
                title: '',
                author: '',
                read: false,
                isbn: '',
            }
        }
    },
    methods: {
        addBook() {
            this.newBook.read = false;
            this.$store.commit('ADD_NEW_BOOK', this.newBook);
            this.newBook = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
        }
    }

}
</script>

<style>

</style>