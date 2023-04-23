import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/initials',
      name: 'initials',
      component: () => import('../views/InitialsView.vue')
    },
    // {
    //   path: '/names',
    //   name: 'names',
    //   component: () => import('../NamesView.vue')
    // },
    // {
    //   path: '/infantile',
    //   name: 'infantile',
    //   component: () => import('../InfantileView.vue')
    // },
    // {
    //   path: '/botanic',
    //   name: 'botanic',
    //   component: () => import('../BotanicView.vue')
    // },
    // {
    //   path: '/stationary',
    //   name: 'stationary',
    //   component: () => import('../StationaryView.vue')
    // },
    // {
    //   path: '/mix',
    //   name: 'mix',
    //   component: () => import('../MixView.vue')
    // },
    {
      path: '/form',
      name: 'form',
      component: () => import('../views/FormAddView.vue')
    },{
      path: '/list',
      name: 'list',
      component: () => import('../views/ListView.vue')
    }
  ]
})

export default router
