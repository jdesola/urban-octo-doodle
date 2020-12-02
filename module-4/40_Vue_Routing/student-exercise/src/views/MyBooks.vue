<template>
  <div class="main">
      <h1>My Books</h1>
      <reading-list />
      <router-link v-bind:to="{name: 'new-book'}">Add Book to Reading List</router-link>
  </div>
</template>

<script>
import ReadingList from '../components/ReadingList'
export default {
    name: 'my-books',
    components: { ReadingList },

}
</script>

<style>

</style>