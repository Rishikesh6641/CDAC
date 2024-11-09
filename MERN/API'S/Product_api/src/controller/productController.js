import { createConnectionObj } from "../Config/dbconfig.js";

const connection=createConnectionObj();

export function savepr(request,response){
    const data=request.body;
    const insertQry=`INSERT INTO products VALUES(${data.id},'${data.name}',${data.price},${data.qty},'${data.description}')`;
    connection.query(insertQry,(error)=>{
        try{
            if(error){
                console.log(error);
                response.status(500).send({message:"===something went wrong"});
            }
            else{
                response.status(200).send({message:"Saved successfully"});
            }

        }catch(error){
            console.log(error)
            response.status(500).send({message:"Something went wrong"});
        }
    })
}

export function getProducts(request,response){
    const selectQry=`SELECT * FROM products`;
    connection.query(selectQry,(error,result)=>{
        try{
            if(error){
                console.log("Something in if of controller");
                response.status(500).send({message:"Something went wrong"});
            }
            else{
                console.log("in else of controller");
                response.status(200).send(result);
            }
        }catch(error){
            console.log("Error caught in catch");
            console.log(error);
        }
    });
}

export function getProductById(request,response){
    var data=parseInt(request.params.id);
    const whereQry=`SELECT * FROM products WHERE id=${data}`;
    connection.query(whereQry,(error,result)=>{
        try{
            if(error){
                console.log(error);
                console.log("Error in controller if");
                response.status(500).send({message:"this.Something went wrong"});
            }
            else{
                console.log("else of controller");
                response.status(200).send(result);
            }
        }catch(error){
            console.log(error);
        }
    });
}

export function deleteData(request,response){
    var data=parseInt(request.params.id);
    const deleteQry=`DELETE FROM products WHERE id=${data}`;
    connection.query(deleteQry,(error,result)=>{
        try{
            if(error){
                console.log("error in if ");
            }else{
                console.log(result);
            }
        }catch(error){
            console.log(error);
        }
    });
}