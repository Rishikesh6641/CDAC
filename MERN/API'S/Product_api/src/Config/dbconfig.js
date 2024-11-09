import {createConnection} from 'mysql';

export function createConnectionObj(){
    return createConnection({
        host: "localhost",
        user: "root",
        password: "cdac",
        database: "cdacmumbai"
    });
}

export function establishConnection(){
    ///const con=createConnectionObj();
    createConnectionObj().connect((error)=>{
        if(error){
            console.log(error);
        }
        else{
            console.log("Connected to database");
        }
    });
}


