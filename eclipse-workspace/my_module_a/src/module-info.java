module my_module_a {
	
	
	exports pack1;
//	requires my_module_b;
//	exports pack2;  pack2은닉
	
	requires transitive my_module_b;  // my_module_b 모듈을 전이적 의존 설정
	
}
