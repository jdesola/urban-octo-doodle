<template>
    <div>
        <a href="#" v-on:click.prevent="showForm = true">Add New Review</a>

        <form v-on:submit.prevent="addNewReview" v-if="showForm" >
            <div class="form-element">
                <label for="reviewer">Name:</label>
                <input id="reviewer" type="text" v-model="newReview.reviewer" />
            </div>
            <div class="form-element">
                <label for="title">Title:</label>
                <input id="title" type="text" v-model="newReview.title" />
            </div>
            <div class="form-element">
                <label for="rating">Rating:</label>
                <select id="rating" v-model.number="newReview.rating">
                    <option value="1">1 Star</option>
                    <option value="2">2 Star</option>
                    <option value="3">3 Star</option>
                    <option value="4">4 Star</option>
                    <option value="5">5 Star</option>
                </select>
            </div>
            <div class="form-element">
                <label for="review">Review:</label>
                <textarea id="review" v-model="newReview.review"></textarea>
            </div>
            <input type="submit" value="Save" v-bind:disabled="!isFormValid" />
            <input type="button" value="Cancel" v-on:click.prevent="resetForm()" />
        </form>
    </div>
</template>

<script>
export default {
    name: "add-review",
    data() {
        return {
            showForm: false,
            newReview: {
                favorited: false
            }
        }
    },
    computed: {
        isFormValid() {
            return this.newReview.reviewer && this.newReview.title &&
                this.newReview.rating && this.newReview.review;
        }
    },
    methods: {
        addNewReview() {
            this.$store.commit("ADD_REVIEW", this.newReview);
            this.resetForm();
        },
        resetForm() {
            this.newReview = {
                favorited: false
            };
            this.showForm = false;
        }
    }
}
</script>

<style>
div.form-element {
 margin-top: 10px;
}
div.form-element > label {
 display: block;
}
div.form-element > input,
div.form-element > select {
 height: 30px;
 width: 300px;
}
div.form-element > textarea {
 height: 60px;
 width: 300px;
}
form > input[type="button"] {
 width: 100px;
}
form > input[type="submit"] {
 width: 100px;
 margin-right: 10px;
}

</style>