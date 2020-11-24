<template>
  <div class="reviews">
      <review-display 
        v-for="review in filteredReviews" 
        v-bind:key="review.id" 
        v-bind:review="review" />
        <div class="no-reviews" v-show="noReviewsFound">
            <p>No {{ $store.state.filter }} Star Reviews Found</p>
        </div>
  </div>

</template>

<script>
import ReviewDisplay from "./ReviewDisplay";

export default {
    name: "review-list",
    components: {
        ReviewDisplay
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

</style>