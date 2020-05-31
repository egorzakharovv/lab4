import data.Student
import data.studentList
import react.*
import react.dom.li
import react.dom.ol
import react.dom.ul

interface RStudentsListProps : RProps {
    var students: Array<Student>
}

val RFStudentList =
    functionalComponent<RStudentsListProps> { props ->
        ul {
            props.students.map {
                li { +"${it.firstname} ${it.surname}" }
            }
        }
    }


fun RBuilder.studentList(students: Array<Student>) =
    child(RFStudentList) {
        attrs.students = students
    }