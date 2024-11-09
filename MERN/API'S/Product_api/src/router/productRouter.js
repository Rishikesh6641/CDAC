import {Router} from "express";
import {getProducts, savepr ,getProductById, deleteData} from "../controller/productController.js";
import { verifyToken } from "../Middleware/VerifyToken.js";

const router=Router();

router.post("/",savepr);
router.get("/getAllProducts",verifyToken,getProducts);
router.get("/getProductById/:id",getProductById);
router.delete("/deleteProduct/:id",deleteData);

export default router;