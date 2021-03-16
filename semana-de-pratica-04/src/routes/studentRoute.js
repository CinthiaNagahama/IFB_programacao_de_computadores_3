const fs = require('fs');
const { join } = require('path');

const filePath = join(__dirname, 'students.json');

const getFormatedStudents = () => {
  const data = fs.existsSync(filePath) ?
    fs.readFileSync(filePath) : 
    []

  try {
    const studentsList = JSON.parse(data);
    var newStudentsList = [];

    studentsList.map((value) => {
      var updateStudent = {
        "nome": "",
        "matricula": "",
        "data_nascimento": "",
        "idade": "",
      }

      updateStudent.nome = value.nome;
      updateStudent.matricula = value.matricula;
      
      var dataNasc = value.data_nascimento;
      dataNasc = dataNasc.split('-');
      const ano = dataNasc[0], mes = dataNasc[1], dia = dataNasc[2]; 
      updateStudent.data_nascimento = `${dia}/${mes}/${ano}`;
      
      now = new Date;
      updateStudent.idade = now.getFullYear() - ano;
      
      if(mes > now.getMonth() || (mes == now.getMonth() && dia > now.getDate())){
        updateStudent.idade--;
      }

      newStudentsList.push(updateStudent);
    });

    return newStudentsList;
  } catch (e) {
    console.log(e);
    return [];
  }
}

const getStudents = () => {
  const data = fs.existsSync(filePath) ?
    fs.readFileSync(filePath) : 
    []

  try {
    const studentsList = JSON.parse(data);
    return studentsList;
  } catch (e) {
    console.log(e);
    return [];
  }
}

const saveStudent = (students) => {
  fs.writeFileSync(filePath, JSON.stringify(students, null, '\t'));
};

const studentRoute = (app) => {
  app.route('/')
    .get((req, res) => {
      const students = getFormatedStudents();

      res.render('index',  {
        students: students
      });
    })
    .post((req, res) => {
      const students = getStudents();

      students.push(req.body);
      saveStudent(students);

      res.status(201).send('OK');
    })
}

module.exports = studentRoute;