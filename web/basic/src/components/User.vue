<script setup lang="ts">
import { onMounted, ref } from 'vue';
import { getUserList, type User } from '../api/user';
import { RouterLink } from 'vue-router';
import { useRoute } from 'vue-router';

// 定义响应式数据，指定类型
const userList = ref<User[]>([]);

const route = useRoute();

// 页面挂载后调用接口
onMounted(async () => {
    try {
        // 调用封装的接口，获取数据
        const data = await getUserList();
        // 数据格式校验：确保赋值的是数组，避免非数组数据导致响应式失效
        if (Array.isArray(data)) {
            userList.value = data; // 直接赋值数组，ref 会自动跟踪响应式
        } else {
            console.warn('接口返回的数据不是数组，已重置为空数组');
            userList.value = [];
        }
    } catch (error) {
        console.error('获取用户列表失败：', error);
    }
});
</script>
<template>
    <div>
        <div>User 组件</div>
        <div>当前路由参数：{{ route.params }}</div>
        <div>当前路由query参数：{{ $route.query }}</div>
        <div>
            <h3>用户列表</h3>
            <ul>
                <li v-for="user in userList" :key="user.id">
                    {{ user.name }} - 年龄：{{ user.age }}
                </li>
            </ul>
        </div>
        <RouterLink to="/">首页</RouterLink>
    </div>
</template>
<style scoped></style>