// const cookieParser = require('cookie-parser');
const express = require('express');
const app = express();

const studentRoute = require('./src/routes/studentRoute');

app
  // Set pug temolate path
  .set('views', './src/views')
  .set('view engine', 'pug')
  // Get data from cookies
  // .use(cookieParser)
  // Get data with get.body
  .use(express.urlencoded({ extended: true }))
  // Port
  .listen(5000, () => console.log('Server is running'));

studentRoute(app);