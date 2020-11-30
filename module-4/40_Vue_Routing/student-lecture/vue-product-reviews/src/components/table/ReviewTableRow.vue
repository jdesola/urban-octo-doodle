<template>
    <tr>
        <td>{{ review.title }}</td>
        <td nowrap>{{ review.reviewer }}</td>
        <td>{{ review.review }}</td>
        <td class="stars">
            <img 
                src="../../assets/star.png" 
                class="ratingStar"
                v-for="n in review.rating" v-bind:key="n"
                v-bind:title="review.rating + ' Star Review'"
            />
        </td>
        <td>
            <input type="checkbox" 
            v-on:change="onFavoritedChange(review)"
            v-bind:checked="review.favorited" />
        </td>
    </tr>
</template>

<script>
export default {
    name: "review-table-row",
    props: ["review"],
    methods: {
        onFavoritedChange(review) {
            this.$store.commit("FLIP_FAVORITED", review);
        }
    }
}
</script>

<style>
.stars {
    display: flex;
}
.stars img {
    width: 20px;
}
</style>