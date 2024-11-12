package kr.ac.kumoh.ce.s20180147.w24t01midterm.controller

import kr.ac.kumoh.ce.s20180147.w24t01midterm.service.WishlistService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WishlistController(private val service: WishlistService) {
  @GetMapping("/wishlist")
  fun getWishlist(data: Model): String{
    val itemList = service.getAllItems()

    data.addAttribute("items", itemList)
    return "wishlist"
  }
}