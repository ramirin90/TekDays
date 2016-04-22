package com.tekdays

class Sponsorship {
    TekEvent event
    Sponsor sponsor
    String contributionType
    String description
    String notes

    static constraints = {
        event nullable: false
        sponsor nullable: false
        contributionType inList:["money", "space", "vehicle", "anything", "cash", "girls"]
        description nullable: true, blank: true
        notes nullable: true, blank: true, maxSize: 5000
    }
}