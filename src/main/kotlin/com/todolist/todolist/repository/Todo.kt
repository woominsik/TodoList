package com.todolist.todolist.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.*

@Entity
class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? =null, //변수 뒤에 ?가 들어간 것은 null이 들어갈 수 있음을 보여준다.

    @Column(nullable = false) // null 가능 여부
    @ColumnDefault("false") // 실제 디비에 들어갈 초기값
    var completed : Boolean = false,

    @Column(nullable = false) // null 가능 여부
    var todoName : String
)