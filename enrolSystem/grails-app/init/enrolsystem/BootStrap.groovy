package com.enrol

class BootStrap {

    def init = { servletContext ->

def lead1 = new Leader
(
fullName:'Oliver Hindley',
department:'Computing',
subject:'Programming',
leaderEmail: 'oliverh@shu.ac.uk',
username:'OJ',
password:'Oliver123',
office:'Owen 2105',
bio:'Oliver is a programming module leader').save()

def lead2 = new Leader
(
fullName:'Peter Collindridge',
department:'Sports',
subject:'Football',
leaderEmail: 'peterc@shu.ac.uk',
username:'peterc',
password:'password99',
office:'Adsetts 3105',
bio:'Peter is a sports module leader').save()

def lead3 = new Leader
(
fullName:'Beth K',
department:'English',
subject:'English Language',
leaderEmail: 'bethk@shu.ac.uk',
username:'bethanyk',
password:'englishlit',
office:'Owen 5055',
bio:'English language course leader').save()

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

def lec3 = new Lecturer
(
fullName:'Lynne C',
post:'Database Module Leader',
subject: 'Databases',
lecturerEmail: 'lynnec@shu.ac.uk',
office:'Cantor 2002',
bio:'Databases module leader').save()

def module1 = new Module(title:'SysArch',
code:'m30',
credits:123,
lecturer:lec1,
course:'Computing',
description:'sysarch module 2').save()

def module2 = new Module(title:'Databases',
code:'D22',
credits:123,
lecturer:lec2,
course:'Computing',
description:'Databases semester 2').save()

def module3 = new Module(title:'Programming',
code:'P11',
credits:123,
lecturer:lec3,
course:'Computing',
description:'Programming C#').save()

def course1 = new Course
(
department:'Computing',
title:'BSC Hon Computing',
leader:lead1,
code:'CS123',
startDate: new Date('09/09/2018'),
endDate: new Date('07/07/2022'),
description:'Lorem ipsum dolor sit amet.',
numberOfStudents:'55',
tuitionFees:'9000.60',
studyMode:'Fulltime').save()

def course2 = new Course
(
department:'Computer Networks',
title:'BSC Computer Networks',
leader:lead2,
code:'CN123',
startDate: new Date('09/09/2018'),
endDate: new Date('07/07/2022'),
description:'Lorem ipsum dolor sit amet.',
numberOfStudents:'65',
tuitionFees:'9000.60',
studyMode:'Fulltime').save()

def course3 = new Course
(
department:'Computer Forensics',
title:'BSC Computer Forensics',
leader:lead3,
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
course:course1).save()

def stud2 = new Student
(
name:'Aidan Whelan',
studentID:'123456788',
dob: new Date('10/05/1995'),
email: 'aidanwhelan@hotmail.com',
username:'aidanw',
password:'liverpoolfc',
isFundingAvailable: 'Yes',
course:course2).save()

def stud3 = new Student
(
name:'Robert Francesco',
studentID:'123456558',
dob: new Date('23/07/1996'),
email: 'robertof@hotmail.com',
username:'robertf',
password:'robert131',
isFundingAvailable: 'Yes',
course:course3).save()

    }
    def destroy = {
    }
}
