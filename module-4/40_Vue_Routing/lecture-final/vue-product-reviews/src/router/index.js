import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products'
import ProductDetail from '@/views/ProductDetail'
import AddReview from '@/views/AddReview'
import NotFound from '@/views/NotFound'
<<<<<<< HEAD
/*import { Store } from 'vuex'*/

=======
import Store from '@/store/index'
import Watcher from '@/views/Watcher'
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
<<<<<<< HEAD
  },
  {
    path: '/products/:id',
    name: 'product-detail',
    component: ProductDetail
  },
  {
=======
  },
  {
    path: '/products/:id',
    name: 'product-detail',
    component: ProductDetail
  },
  {
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReview
  },
  {
    path: '/products',
    redirect: { name: 'products' }
  },
  {
<<<<<<< HEAD
=======
    path: '/watcher',
    name: 'watcher',
    component: Watcher
  },
  {
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
    path: '*',
    name: 'notFound',
    component: NotFound
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})
/*
  to - the route the user is trying to get to
  from - the route the user is coming from
  next - where to send the user next
*/
router.beforeEach( (to, from, next) => {
  if (to.name == 'product-detail' || to.name == 'add-review') {
    const id = to.params.id;
    const product = Store.state.products.find( p => {
      return p.id == id;
    });
    if (!product) {
      // redirect the user to the 404
      next( { name: 'notFound' } );
    }
  }
  // send the user to where they were planning to go
  next();
})

/*router.beforeEach( (to, from, next) => {
  if (to.name == 'product-detail' || to.name == 'add-review') {
    const id = to.params.id;
    const product = Store.state.products.find( p=> {
      return p.id == id;
    });
    if (!product) {
      next( { name: 'notFound' });
    }
  }
  next();
})*/

export default router
