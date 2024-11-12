package kr.ac.kumoh.ce.s20180147.w24t01midterm.service

import kr.ac.kumoh.ce.s20180147.w24t01midterm.repository.WishlistRepository
import org.springframework.stereotype.Service

@Service
class WishlistService(private val repository: WishlistRepository) {
  fun getAllItems() = repository.findAll()
}