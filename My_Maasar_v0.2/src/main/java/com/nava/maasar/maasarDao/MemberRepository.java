package com.nava.maasar.maasarDao;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.h2.SessionFactory;

/**
 *
 * @author j713n
 */
/**
@Repository
public class MemberRepository implements MemberInterface {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public MemberRepository() {
        //default constructor
    }
    
    @Override
    public void addMember(Member member) {
        //need to add missing code
    }
    
    @Override
    public ArrayList<Member> getMemberList() {
        ArrayList<Member> memberList;
        return memberList; //need to add missing code
    }
    
    @Override
    public Member getMember(int Id) {
        Member member;
        return member;
    }
    
    @Override
    public Member updateMember(Member member) {
        
        return null;
    }
    
}
*/