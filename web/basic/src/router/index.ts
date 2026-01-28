import { defineAsyncComponent } from 'vue';
import { createRouter, createWebHistory } from 'vue-router';

const routes = [
    {
        path: '/',
        name: 'Home',
        component: defineAsyncComponent(() => import('../components/Easy.vue')),
    },
    {
        path: '/user',
        name: 'User',
        // component: () => import('../components/User.vue'),
        // 路由级按需加载
        component: defineAsyncComponent(() => import('../components/User.vue')),
    },
    {
        path:'/params/:id/:name',
        name:'Params',
        component: defineAsyncComponent(() => import('../components/Params.vue')),
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

//  全局导航守卫
// router.beforeEach((to, from, next) => {
//     // console.log("路由跳转之前", to, from);
//     // 权限控制

//     // 所有router导航失效
//     // if (false) {
//     //     next();
//     // }

//     next();
// });

// vue-router4的路由守卫不再是通过next放行，而是通过return返回true或false或者一个路由地址
router.beforeEach(async () => {
    return true;
    // return false;
});

export default router;