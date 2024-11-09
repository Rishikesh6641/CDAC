import jwt from 'jsonwebtoken'

export function verifyToken(request,response,next){
    const authhead=request.get("Authorization");

    if(authhead){
        const token=authhead.split(" ")[1];
        jwt.verify(token,"pass123",(error,payload)=>{
            if(error){
                response.status(500).send({message:"Something was wrong"});
            }else{
                next();
            }
        });
    }else{
        response.status(500).send({message:"Suspsious activity "})
    }
}