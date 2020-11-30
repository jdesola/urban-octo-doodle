<template>
  <table>
      <tr>
          <th>Title</th>
          <th>Reviewer</th>
          <th>Review</th>
          <th>Rating</th>
          <th>Favorited</th>
      </tr>
      <review-table-row 
        v-for="review in filteredReviews"
        v-bind:key="review.id"
        v-bind:review="review" />
        <tr v-show="filteredReviews.length == 0">
            <td colspan="5"> No reviews found</td>
        </tr>
  </table>
  
</template>

<script>
import ReviewTableRow from './ReviewTableRow.vue'
export default {
    name: 'review-table',
    components: { 
         ReviewTableRow 
    },
    computed: {
        noReviewsFound() {
            return this.filteredReviews.length === 0;
        },
        filteredReviews() {
            const reviewsFilter = this.$store.state.filter;
            const reviews = this.$store.state.reviews;
            return reviews.filter( review => {
                return reviewsFilter === 0 ? true : reviewsFilter === review.rating;
            });
        }
    }

}
</script>

<style>
    th,td {
        text-align: left;
    }
    td {
        padding-right: 10px;
        vertical-align: top;
    }
    tr:nth-child(even) {
        background-color: rgb(238, 238, 238);
    }
</style>