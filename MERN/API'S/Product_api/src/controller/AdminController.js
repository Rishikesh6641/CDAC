import jwt from "jsonwebtoken";
import { createConnectionObj } from "../Config/dbconfig.js";
import bcrypt from 'bcrypt'

const connection=createConnectionObj();

export function registerAdmin(request,response){
    var data =request.body;
    var encryptedPassword=bcrypt.hashSync(data.password,12);

    const insertQry=`INSERT INTO admin VALUES(${data.id},'${data.name}','${data.username}','${encryptedPassword}')`;
    connection.query(insertQry,(error)=>{
        try{
            if(error){
                console.log("inside if error");
                response.status(500).send({message:"Something went wrong..."});
            }else{
                console.log("done");
                response.status(200).send({message:"Admin registered"});
            }
        }catch(error){
            console.log("error in catch");
            response.status(401).send(error);
        }
    });
}

// export function adminLogin(request,response){
//     try{
//         var data=request.body;
//         const selectQry=`SELECT FROM admin WHERE username='${data.username}'`;
//         connection.query(selectQry,(error,result)=>{
//             if(error){
//                 response.status(500).send({message:"something went wrong inside if"});
//             }else{
//                 if(result.length>0){
//                     if(bcrypt.compareSync(data.username,result[0].username)){
//                         jwt.sign({adminId:result.id},"pass123",(error,token)=>{
//                             if(error)response.status(500).send({message:"Something went wrong"});
//                             else response.status(200).send({message:"Login Successfull",token});
//                         })
//                         response.status(200).send("Login Sucessfully...");
//                     }else{
//                         response.status(500).send("invalid password");
//                     }
//                 }else{
//                     response.status(500).send("invalid username");
//                 }
//             }
//         });
//     }catch(error){
//         response.send(error);
//     }
// }


export function adminLogin(request,response){
    var data=request.body;
    const selectQry=`SELECT * FROM admin WHERE username='${data.username}'`;
   
    connection.query(selectQry,(error,result)=>{
        try{
            
            if(error){
                console.log("Error in if");
                console.log(error);
            }else{
                if(result.length>0){
                    if(bcrypt.compareSync(data.password,result[0].password)){
                        jwt.sign({admindata:result[0].id},"pass123",(error,token)=>{
                            if(error){
                                response.status(500).send({message:"Something went wrong"});
                            }else{
                                response.status(200).send({message:"Done",token});
                            }
                        });
                        // response.status(200).send("Login sucessfull...");
                    }else{
                        response.status(500).send("invalid password...");
                    }
                }else{
                    response.status(400).send("invalid user name");
                }
            }

        }catch(error){
            response.status(500).send(error);
        }
    });
}