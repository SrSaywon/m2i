import Todo from "./Todo.js";

const todo = []

document.querySelector('form#form-todo').addEventListener('submit',(event) => {
    event.preventDefault()

    const newtodo = new Todo(
        document.querySelector('input#title').value,
        document.querySelector('input#description').value,
        document.querySelector('input#deadline').value
    )

    todo.push(newtodo)

    console.log(todo);

    todo.map((tableTodo) => {
        const newTr = document.createElement('tr')
        const tdTitle = document.createElement('td')
        const tdDescription = document.createElement('td')
        const tdDeadline = document.createElement('td')

        tdTitle.textContent = tableTodo.title
        tdDescription.textContent = tableTodo.description
        tdDeadline.textContent = tableTodo.deadline
        newTr.appendChild(tdTitle)
        newTr.appendChild(tdDescription)
        newTr.appendChild(tdDeadline)

        return newTr
    }).forEach(trElement => {
        document.querySelector("table#myTable > tbody").appendChild(trElement)
    })

})