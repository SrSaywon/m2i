import User from "./User.js"

const listUser = []


// const myButton = document.querySelector('button')
// const myForm = document.querySelector('form-user')
// const userFirstname = document.querySelector('input#firstname')
// const userLastname = document.querySelector('input#lastname')
// const userEmail = document.querySelector('input#email')
// const userPassword = document.querySelector('input#password')

document.querySelector("form#form-user").addEventListener('submit', (event) => {
    event.preventDefault()
    const newUser = new User(
        document.querySelector('input#firstname').value,
        document.querySelector('input#lastname').value,
        document.querySelector('input#email').value,
        document.querySelector('input#password').value
        )
    listUser.push(newUser)
    console.log(listUser);

    document.querySelector("span#nb-user").textContent =  "Nombre d'utilisateur : " + listUser.length
})


