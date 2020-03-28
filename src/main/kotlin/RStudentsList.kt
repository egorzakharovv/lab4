import data.Student
import data.studentList
import react.*
import react.dom.li
import react.dom.ol

interface RStudentsListProps : RProps {
    var students: Array<Student>
}

class RStudentsList : RComponent<RStudentsListProps, RState>() {
    override fun RBuilder.render() {
        ol {
            props.students.map {
                li {
                    rstudent(it)
                }
            }
        }
    }
}

fun RBuilder.listOfStudents(students: Array<Student>) =
    child(functionalComponent<RStudentsListProps> {
        ol {
            studentList.map {
                li {
                    rstudent(it)
                }
            }
        }
    }) {
        attrs.students = students
    }