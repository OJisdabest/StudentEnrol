package com.enrol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CourseSpec extends Specification implements DomainUnitTest<Course> {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees() {

	when: "A course has title and fees"

	def computing=new Course(title: 'Bsc Hon Computing', fees:9500)

	then: "The calculateFees method will total fees"

	computing.calculateFees()== 38000

    }
}
