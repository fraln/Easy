import axios from 'axios';

// 创建 Axios 实例，配置基础路径（Spring 后端地址）
const request = axios.create({
  baseURL: 'http://localhost:8080', // Spring 后端的基础地址
  timeout: 5000, // 请求超时时间
  headers: {
    'Content-Type': 'application/json;charset=utf-8'
  }
});

// 请求拦截器（可选，比如添加 token）
request.interceptors.request.use(
  (config) => {
    // 示例：添加 token 到请求头
    // const token = localStorage.getItem('token');
    // if (token) config.headers.Authorization = token;
    return config;
  },
  (error) => Promise.reject(error)
);

// 响应拦截器（可选，统一处理返回结果）
request.interceptors.response.use(
  (response) => {
    // 只返回响应的 data 部分
    return response.data;
  },
  (error) => {
    // 统一处理错误
    console.error('请求错误：', error.message);
    return Promise.reject(error);
  }
);

export default request;