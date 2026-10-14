// const express = require("express");
// const cors = require("cors");

// const app = express();

// app.use(cors());
// app.use(express.json()); // modern way

// // Dummy user
// const user = {
//     username: "admin",
//     password: "1234"
// };

// // Correct route
// app.post("/login", (req, res) => {

//     const { username, password } = req.body;

//     if (username === user.username && password === user.password) {
//         res.json({
//             success: true,
//             token: "abc123"
//         });
//     } else {
//         res.json({
//             success: false
//         });
//     }
// });

// app.listen(3000, () => {
//     console.log("Server running on http://localhost:3000");
// });