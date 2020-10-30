package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// The global request mapping can be deleted or used.  If used it is prepended to every path
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
    // If using the global request mapping
	    // RequestMapping to go to /auctions
	    //@RequestMapping(method=RequestMethod.GET)
	
	    // RequestMapping to go to /auctions/1
	    //@RequestMapping(path="/{id}", method=RequestMethod.GET)
}
