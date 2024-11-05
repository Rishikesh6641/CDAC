try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    console.log(response);
    const users = await response.json();
    console.log("-----------------------------------------------");
    console.log(users);
 } catch (error) {
    console.log(error);
 }