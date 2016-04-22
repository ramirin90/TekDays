import com.tekdays.*

class BootStrap {

    def init = { servletContext ->
        new TekUser(fullName: 'ramiro herrera',
                    userName: 'ramiro',
                    password: 'ramiro',
                    email: 'ramiroherreraruiz@gmail.com',
                    website: 'http://www.ramiroherrera.com',
                    bio: 'software engineer').save()
//        new TekUser(fullName: '',
//                    userName: '',
//                    password: '',
//                    email: '',
//                    website: '',
//                    bio: '''''').save()
        def event1 = new TekEvent(name: 'grails event',
                     city: 'saltillo',
                     organizer: TekUser.findByFullName('ramiro herrera'),
                     venue: 'Hexaware offices',
                     startDate: new Date('11/04/2016'),
                     endDate: new Date('12/04/2016'),
                     description: 'This bootcamp is a workshop to motivate the students to learn groovy on grails')

        if(!event1.save()){
            event1.errors.allErrors.each{error ->
                println "An error occured with event1: ${error}"
            }
        }
//
//        def event2 = new TekEvent(name: '',
//                     city: '',
//                     organizer: TekUser.findByFullName(''),
//                     venue: '',
//                     startDate: new Date('mm/dd/yyyy'),
//                     endDate: new Date('mm/dd/yyyy'),
//                     description: '''''')
//
//        if(!event2.save()){
//            event2.errors.allErrors.each{error ->
//                println "An error occured with event2: ${error}"
//            }
//        }
//
        def g1 = TekEvent.findByName('grails event')
        g1.addToVolunteers(new TekUser(fullName: 'bill gates',
                                       userName: 'bill',
                                       password: 'gates',
                                       email: 'billgates@gmail.com',
                                       website: 'http://www.billgates.com',
                                       bio: 'thechnology user'))
//        g1.addToVolunteers(new TekUser(fullName: '',
//                                       userName: '',
//                                       password: '',
//                                       email: '',
//                                       website: '',
//                                       bio: ''))
        g1.addToRespondents('reponder1')
//        g1.addToRespondents('')
//        g1.addToRespondents('')
//
        g1.save()
//
//
        def s1 = new Sponsor(name:'Hexaware',
                             website:'http://www.hexaware.com',
                             description:'A TI Indian company born in the 90s',
							 ).save()
										  
//        def s2 = new Sponsor(name:'',
//                             website:'',
//                             description:'').save()
        def sp1 = new Sponsorship(event:g1,
                                  sponsor:s1,
                                  contributionType:'space and money',
                                  description:'The sponsor of the event').save()
//        def sp2 = new Sponsorship(event:g1,
//                                  sponsor:s2,
//                                  contributionType:'',
//                                  description:'').save()
//


								  

    }
    def destroy = {
    }
}
