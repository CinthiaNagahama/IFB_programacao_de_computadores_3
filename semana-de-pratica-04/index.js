const express = require('express');
const app = express();

const cookieParser = require('cookie-parser');

const studentRoute = require('./src/routes/studentRoute');

var students = [];

app
  // Set pug temolate path
  .set('views', './src/views')
  .set('view engine', 'pug')
  // Get data from cookies
  .use(cookieParser())
  // Get data with get.body
  .use(express.urlencoded({ extended: true }))
  // GET
  .get('/', (req, res) => {
    res.render('index', {
      students: req.cookies.students
    });
  })
  // POST
  .post('/', (req, res) => {
    students.push(req.body);

    res.cookie('students', students, {httpOnly: true});

    var newStudentsList = [];
    students.map((value) => {
      var updateStudent = {
        "nome": "",
        "matricula": "",
        "data_nascimento": "",
        "idade": ""
      };

      updateStudent.nome = value.nome;
      updateStudent.matricula = value.matricula;
      
      var dataNasc = value.data_nascimento;
      dataNasc = dataNasc.split('-');
      const ano = dataNasc[0], mes = dataNasc[1], dia = dataNasc[2]; 
      updateStudent.data_nascimento = `${dia}/${mes}/${ano}`;
      
      now = new Date;
      updateStudent.idade = now.getFullYear() - ano;
      
      if(mes > now.getMonth() || (mes == (now.getMonth() + 1) && dia > now.getDate())){
        updateStudent.idade--;
      }
      newStudentsList.push(updateStudent);
    });

    res.render('index', {
      students: newStudentsList
    });
  })
  // Port
  .listen(3000, () => console.log('Server is running on port 3000'));

studentRoute(app);