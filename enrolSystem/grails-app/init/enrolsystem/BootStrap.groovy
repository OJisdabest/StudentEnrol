package com.enrol

class BootStrap {

    def init = { servletContext ->
def jDoe= new Module(title:'SysArch',
code:'m30',
credits:123,
lecturer:'Tonderai',
course:'Computing',
description:'sysarch module 2').save()

def comp = new Course
(
department:'Computing',
title:'BSC Hon Computing',
leader:'Dr Michelle Murphy',
code:'CS123',
startDate: new Date('09/09/2018'),
endDate: new Date('07/07/2022'),
description:'Lorem ipsum dolor sit amet.',
numberOfStudents:'55',
tuitionFees:'9000.60',
studyMode:'Fulltime').save()

def compN = new Course
(
department:'Computer Networks',
title:'BSC Computer Networks',
leader:'Dr Bob Lee',
code:'CN123',
startDate: new Date('09/09/2018'),
endDate: new Date('07/07/2022'),
description:'Lorem ipsum dolor sit amet.',
numberOfStudents:'65',
tuitionFees:'9000.60',
studyMode:'Fulltime').save()

def compF = new Course
(
department:'Computer Forensics',
title:'BSC Computer Forensics',
leader:'Dr Rob Sorrentino',
code:'CF123',
startDate: new Date('09/09/2018'),
endDate: new Date('07/07/2022'),
description:'Lorem ipsum dolor sit amet.',
numberOfStudents:'45',
tuitionFees:'9000.60',
studyMode:'Fulltime').save()

def stud1 = new Student
(
name:'Bob Lee',
studentID:'123456789',
dob: new Date('20/03/1995'),
email: 'boblee@gmail.com',
username:'bobbylee',
password:'boblee123',
isFundingAvailable: 'Yes',
course:'Electrical Engineering').save()

def stud2 = new Student
(
name:'Aidan Whelan',
studentID:'123456788',
dob: new Date('10/05/1995'),
email: 'aidanwhelan@hotmail.com',
username:'aidanw',
password:'liverpoolfc',
isFundingAvailable: 'Yes',
course:'Business Studies').save()

def lec1 = new Lecturer
(
fullName:'Tonderai M',
post:'Lecturer',
subject: 'System Architectures',
lecturerEmail: 'tonderai@shu.ac.uk',
office:'Cantor 2103',
bio:'Tonderai is an expert in System Architectures').save()

def lec2 = new Lecturer
(
fullName:'Lynne D',
post:'Course Leader',
subject: 'PPSS',
lecturerEmail: 'lynne@shu.ac.uk',
office:'Cantor 2105',
bio:'Lynne Dawson is the course leader for BSC Computing').save()

def lead1 = new Leader
(
fullName:'Oliver Hindley',
post:'Course Leader',
email: 'oliverh@shu.ac.uk',
office:'Owen 2105').save()

def lead2 = new Leader
(
fullName:'Peter Collindridge',
post:'Course Deputy Leader',
email: 'peterc@shu.ac.uk',
office:'Adsetts 3105').save()


    }
    def destroy = {
    }
}
