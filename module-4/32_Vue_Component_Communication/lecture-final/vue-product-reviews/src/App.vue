<template>
  <div id="app" class="main">
    <h1>Product Reviews for {{ $store.state.name }}</h1>
    <p class="description">{{ $store.state.description }}</p>
    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2" />
      <star-summary rating="3" />
      <star-summary rating="4" />
      <star-summary rating="5" />
    </div>
    <add-review />
    <div class="view-type">
      <a href="#" v-on:click.prevent="tableView = true">Table View</a>
      <a href="#" v-on:click.prevent="tableView = false">List View</a>
    </div>
    <review-list  v-if="!tableView" />
    <review-table  v-if="tableView" />
  </div>
</template>

<script>
import AverageSummary from "./components/AverageSummary"
import ReviewList from './components/ReviewList.vue'
import StarSummary from './components/StarSummary.vue'
import AddReview from './components/AddReview.vue'
import ReviewTable from './components/table/ReviewTable.vue'

export default {
  name: 'App',
  components: {
    AverageSummary,
    StarSummary,
    ReviewList,
    AddReview,
    ReviewTable
  },
  data() {
    return {
      tableView: false,
    }
  }
}
</script>

<style>
div.view-type {
  display: flex;
  justify-content: flex-end;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  max-width: 800px;
  margin: 60px auto 0 auto;
}
div.main {
    margin: 1rem 0;
}
div.main div.well-display {
    display: flex;
    justify-content: space-around;
}

div.main div.well-display div.well {
    display: inline-block;
    width: 15%;
    border: 1px black solid;
    border-radius: 6px;
    text-align: center;
    margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
    color: darkslategray;
    display: block;
    font-size: 2.5rem;
}

div.main div.review {
    border: 1px black solid;
    border-radius: 6px;
    padding: 1rem;
    margin: 10px;
}

div.main div.review div.rating {
    height: 2rem;
    display: inline-block;
    vertical-align: top;
    margin: 0 0.5rem;
}

div.main div.review div.rating img {
    height: 100%;
}

div.main div.review p {
    margin: 20px;
}

div.main div.review h3 {
    display: inline-block;
}

div.main div.review h4 {
    font-size: 1rem;
}

div.main div.review.favorited {
    background-color: lightyellow;
}

div.form-element {
  margin-top: 10px;
}
div.form-element > label {
  display: block;
}
div.form-element > input, div.form-element > select {
  height: 30px;
  width: 300px;
}
div.form-element > textarea {
  height: 60px;
  width: 300px;
}
form > input[type=button] {
  width: 100px;
}
form > input[type=submit] {
  width: 100px;
  margin-right: 10px;
}
div.main div.well-display div.well span.amount:hover {
    color: blue;
    cursor: pointer;
}

</style>
