<template>
  <div class="main">
      <h1>{{ product.name }}</h1>
<<<<<<< HEAD
      <p class="description">{{ product.description }}</p>
      <div class="actions">
          <router-link :to="{name: 'products'}"> Back to Products</router-link>&nbsp; |
          <router-link :to="{
              name: 'add-review',
              params: { id: product.id }
              }"> Add Review</router-link>
      </div>
      <div class="well-display">
          <average-summary />
          <star-summary rating="1"/>
          <star-summary rating="2"/>
          <star-summary rating="3"/>
          <star-summary rating="4"/>
          <star-summary rating="5"/>
=======
      <p class="description">{{ product.description}}</p>
      <div class="actions">
          <router-link :to="{ name: 'products' }">Back to Products</router-link>&nbsp;|
          <router-link :to="{
              name: 'add-review',
              params: { id: product.id }
          }">Add Review</router-link>
      </div>
      <div class="well-display">
          <average-summary />
          <star-summary rating="1" />
          <star-summary rating="2" />
          <star-summary rating="3" />
          <star-summary rating="4" />
          <star-summary rating="5" />
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
      </div>
      <review-list />
  </div>
</template>

<script>
<<<<<<< HEAD
import AverageSummary from '@/components/AverageSummary';
import StarSummary from '@/components/StarSummary';
import ReviewList from '@/components/ReviewList';
=======
import AverageSummary from '@/components/AverageSummary'
import StarSummary from '../components/StarSummary.vue';
import ReviewList from '../components/ReviewList.vue';

>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
export default {
    name: 'product-detail',
    components: {
        AverageSummary,
        StarSummary,
        ReviewList
    },
    computed: {
        product() {
            return this.$store.state.products.find(
                p => {
                    return p.id == this.$store.state.activeProduct;
                }
            )
        }
    },
    created() {
<<<<<<< HEAD
        const activeProductID = this.$route.params.id;
        this.$store.commit('SET_ACTIVE_PRODUCT', activeProductID);
    }

=======
        // get the product id from the url
        const activeProductID = this.$route.params.id;
        // set the active proeduct in the store
        this.$store.commit('SET_ACTIVE_PRODUCT', activeProductID)
    }
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
}
</script>

<style>
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
 
div.main div.well-display div.well {
 cursor: pointer;
}
<<<<<<< HEAD
</style>
=======
</style>
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
