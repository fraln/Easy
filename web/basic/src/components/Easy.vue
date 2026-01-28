<script setup lang="ts">
import request from '../utils/request';
import { onMounted, ref } from 'vue';

const helloMsg = ref<string | any>('');

onMounted(async () => {
    try {
        // 直接调用，注意跨域问题
        const res = await request.get<string>('/api/hello');
        // console.log('接口调用成功：', res);
        helloMsg.value = res;
    } catch (err) {
        console.error('接口调用失败：', err);
    }
});
</script>
<template>
    <div>
        <div>Easy 组件</div>

        <text>{{ helloMsg }}</text>
        <div>
            <!-- 使用 RouterLink 进行路由跳转 -->
            <RouterLink to="/user">用户页</RouterLink>
        </div>
        <!-- 通过方法跳转（附带参数） -->
        <button @click="$router.push({ path: '/user', query: { a: 'easy' } })">
            query跳转到用户页（附带参数）URL 显式拼接
        </button>

        <!-- 注意：params 必须配合 name（命名路由）使用，不能用 path！ -->
        <button @click="$router.push({ name: 'Params', params: { id: '123', name: 'params' } })">
            params跳转到用户页（附带参数）URL 路径嵌入
        </button>
    </div>
</template>
<style scoped></style>