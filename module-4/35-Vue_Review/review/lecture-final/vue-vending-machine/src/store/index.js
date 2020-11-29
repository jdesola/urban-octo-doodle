import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    items: []
  },
  mutations: {
    ADD_ALL_ITEMS(state, items) {
      state.items = items;
    }
  },
  actions: {
    getProducts({ commit }) {
      fetch("inventory.json")
        .then( response => {
          return response.json();
        })
        .then( items => {
          commit("ADD_ALL_ITEMS", items);
        })
        .catch( err => console.error(err) );

    }
  },
  modules: {
  }
})
