const taskInput = document.getElementById("taskInput");
const addBtn = document.getElementById("addBtn");
const taskList = document.getElementById("taskList");
const searchInput = document.getElementById("searchInput");
const taskCount = document.getElementById("taskCount");
const clearCompleted = document.getElementById("clearCompleted");
const filterButtons = document.querySelectorAll(".filter");

let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

let currentFilter = "all";

function saveTasks() {
    localStorage.setItem("tasks", JSON.stringify(tasks));
}

function displayTasks() {

    taskList.innerHTML = "";

    const searchText = searchInput.value.toLowerCase();

    let filteredTasks = tasks.filter(function(task) {

        const matchesSearch = task.text
            .toLowerCase()
            .includes(searchText);

        if (currentFilter === "active") {
            return !task.completed && matchesSearch;
        }

        if (currentFilter === "completed") {
            return task.completed && matchesSearch;
        }

        return matchesSearch;
    });

    if (filteredTasks.length === 0) {

        const emptyMessage = document.createElement("li");

        emptyMessage.className = "empty";

        emptyMessage.textContent = "No tasks found.";

        taskList.appendChild(emptyMessage);

    } else {

        filteredTasks.forEach(function(task) {

            const li = document.createElement("li");

            li.className = "task";

            if (task.completed) {
                li.classList.add("completed");
            }

            const checkbox = document.createElement("input");

            checkbox.type = "checkbox";

            checkbox.checked = task.completed;

            checkbox.addEventListener("change", function() {
                toggleTask(task.id);
            });

            const span = document.createElement("span");

            span.className = "task-text";

            span.textContent = task.text;

            const editButton = document.createElement("button");

            editButton.className = "edit-btn";

            editButton.textContent = "Edit";

            editButton.addEventListener("click", function() {
                editTask(task.id);
            });

            const deleteButton = document.createElement("button");

            deleteButton.className = "delete-btn";

            deleteButton.textContent = "Delete";

            deleteButton.addEventListener("click", function() {
                deleteTask(task.id);
            });

            li.appendChild(checkbox);
            li.appendChild(span);
            li.appendChild(editButton);
            li.appendChild(deleteButton);

            taskList.appendChild(li);
        });
    }

    updateTaskCount();
}

function addTask() {

    const text = taskInput.value.trim();

    if (text === "") {
        alert("Please enter a task.");
        return;
    }

    const newTask = {
        id: Date.now(),
        text: text,
        completed: false
    };

    tasks.push(newTask);

    saveTasks();

    taskInput.value = "";

    displayTasks();
}

function toggleTask(id) {

    tasks = tasks.map(function(task) {

        if (task.id === id) {
            task.completed = !task.completed;
        }

        return task;
    });

    saveTasks();

    displayTasks();
}

function editTask(id) {

    const task = tasks.find(function(task) {
        return task.id === id;
    });

    if (!task) {
        return;
    }

    const newText = prompt("Edit your task:", task.text);

    if (newText !== null && newText.trim() !== "") {

        task.text = newText.trim();

        saveTasks();

        displayTasks();
    }
}

function deleteTask(id) {

    tasks = tasks.filter(function(task) {
        return task.id !== id;
    });

    saveTasks();

    displayTasks();
}

function updateTaskCount() {

    const activeTasks = tasks.filter(function(task) {
        return !task.completed;
    });

    const count = activeTasks.length;

    taskCount.textContent =
        count + (count === 1 ? " task left" : " tasks left");
}

clearCompleted.addEventListener("click", function() {

    tasks = tasks.filter(function(task) {
        return !task.completed;
    });

    saveTasks();

    displayTasks();
});

addBtn.addEventListener("click", addTask);

taskInput.addEventListener("keypress", function(event) {

    if (event.key === "Enter") {
        addTask();
    }
});

searchInput.addEventListener("input", displayTasks);

filterButtons.forEach(function(button) {

    button.addEventListener("click", function() {

        filterButtons.forEach(function(btn) {
            btn.classList.remove("active");
        });

        button.classList.add("active");

        currentFilter = button.dataset.filter;

        displayTasks();
    });
});

displayTasks();