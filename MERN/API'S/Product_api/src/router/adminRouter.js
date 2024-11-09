import { Router } from "express";
import { adminLogin, registerAdmin } from "../controller/AdminController.js";

const adminrouter=Router();

adminrouter.post("/admins",registerAdmin);
adminrouter.post("/login",adminLogin);
export default adminrouter;