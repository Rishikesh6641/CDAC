import express from 'express'
import { establishConnection } from './src/Config/dbconfig.js';
import router from './src/router/productRouter.js';
import adminrouter from './src/router/adminRouter.js';

const app=express();
app.use(express.json());
app.use("/",router);
app.use("/getAllProducts",router);
app.use("/getProductById/:id",router);
app.use("/deleteProduct/:id",router);
app.use("/admins",adminrouter);
app.use("/login",adminrouter);
app.listen(4050,()=>{
    console.log("Server Started...");
    establishConnection();
});
