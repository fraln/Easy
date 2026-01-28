import request from '../utils/request';

// 定义接口返回数据的类型（TS 特性，类型约束）
export interface User {
  id: number;
  name: string;
  age: number;
}

// 获取用户列表（ Spring 后端 /api/list 接口）
export const getUserList = () => {
  return request.get<User[]>('/api/list');
};

// 新增用户（POST 请求示例）
// export const addUser = (user: Omit<User, 'id'>) => {
//   return request.post('/api/add', user);
// };