package com.nava.maasar.maasarDao;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author j713n
 */
public interface MemberInterface extends CrudRepository<Member, Integer> {
    
    public void addMember(Member member);
    
    public ArrayList<Member> getMemberList();
    
    public Member getMember(int Id);
    
    public Member updateMember(Member member);
    
}
