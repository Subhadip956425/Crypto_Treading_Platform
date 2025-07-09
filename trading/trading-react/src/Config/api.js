<<<<<<< HEAD
import axios from "axios";

export const API_BASE_URL = "http://localhost:5454";

const api = axios.create({
    baseURL: API_BASE_URL,
    headers:{
        "Content-Type":"application/json"
    }
})

=======
import axios from "axios";

export const API_BASE_URL = "http://localhost:5454";

const api = axios.create({
    baseURL: API_BASE_URL,
    headers:{
        "Content-Type":"application/json"
    }
})

>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
export default api;