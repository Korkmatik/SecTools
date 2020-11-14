# Description
This directory contains a library implemented in Java. With this library it is possible to fetch data from Threatcrowd's API.

# Usage

## Antivirus
You can use the `api.v2.AntivirusAPI` class to fetch data from the `Antivirus` endpoint of Threatcrowd's API.
Example usage:

```java
AntivirusAPI api = new AntivirusAPI();

try {
  AntivirusResponse resp = api.getAntivirus("plugx");

  System.out.println(resp.getResponseCode());
  System.out.println(resp.getHashes());
  System.out.println(resp.getReferences());
  System.out.println(resp.getPermalink());
} catch (IOException e) {
  e.printStackTrace();
} catch (InterruptedException e) {
  e.printStackTrace();
}
```

Output:
```
1
[31d0e421894004393c48de1769744687, 5cd3f073caac28f915cf501d00030b31, bbd9acdd758ec2316855306e83dba469, ef9d8cd06de03bd5f07b01c1cce9761f, 06bd026c77ce6ab8d85b6ae92bb34034, 2af64ba808c79dccd2c1d84f010b22d7, 47a311084bffddf6c00b4eb947b4086b, 4c5e55c2ce6e9176970aeecf9533cdbf, 4f92b6c9c55142ee562e8237ce1436a2, 876f24c4102a4e911ab77ee328643dd2, a5f60f1fa6e80fdbe82eff51c1245460, d1cf99542ca24d1a8726a17ee25310ec, 013c366d7233063086add9dd67b66224, 01b16dff4a49a1f368c547e3a7bed9ce, 0237959096e10240f1c84828cb66d033, 0317203dfb69e5a1977e71701cdac0e0, 0371392c0fd68d34552fa17aea1c6c6e, 0399c89e212d751b41d491e3634d1a4b, 05383303a1417d06aabf1d63c95ec9de, 07933ce0ae042fd63160aa60f8369781, 09654683ab715f5507316602f1e74c26, 0972f0addd270a9b87a821d535a8bedb, 09c129a0c7af6b98902d18ad8d154c54, 0ad92ae7b7097953b822e151155af6b2, 0bf5e206b4058887633ad8a3e7e0bdea, 0c51dcf7fbda4d98cee2fa798eb08bd9, 0d76bc28e20e775cd48eaa1003b733b8, 0de2dc76a10d583f2d8c5c1e780a7f39, 0e76e6cea60034b5f897f4e8e661ad03, 0ed4dc6fe7938a5477a65a5a49e5392d, 0fe3aaeac0f3bd288f1cf5778267bc25, 1102005f77b1a2238800bbbbddb92cd2, 116e73e7492353947b31bb8f23d4f58a, 13e9f9d53cd4bbd0288a209c136bd835, 178d14b3a81f09e1d88c14df5465c7b3, 198fd054105ad89a93e401d8f59320d1, 1a49878c6d1902ad9cdd8bc84c0842f0, 1b37345b2d8a202846ccda109e7da503, 1c87f3704911d94d89fcf4f4c05c1897, 1e33cc8d060343780eec7bfeaf861c88, 1e728ba8947b8913807562ff7f010a1f, 1ed0137d6b78f00f2ed3945d84d626aa, 217be59938b1c6c6aa0e5c9f86aaf8bf, 23ab1791d333f51f891dcacd753332ea, 241aa4c773ffeed4f73f90da9cd4b3c2, 261a336ac5f9ffd6b6f6629d71c694d7, 269af7f80e918469702352052585ab41, 2743b6bece1c5b6c30747da080c26673, 2782c6cca0fad33d896feef4ec92f24b, 27b2ef2fa1c46239b7da08e61533d3c9, 2854e38975dd8dff5735d2b0cba1012e, 28917fb1d33bd636f03a90a5c5c8ffeb, 2917ce62d10e2e163c741a912cbbddc2, 291976ba47cec4b3c0e31cbc50ab1923, 2b52c923e30f4338fc87edb32b56bf55, 2bc9bfcc2127b50b703aeb4ac35556c5, 2c66241bac63a5dfda8c4bed2f3b9f8c, 2c7bad4f4a4df3025aa1345db27c7408, 2d3e9b7476ccb4f3ef0882edaf6ae7a6, 2e21447d3d6d48044f43665cc7ace526, 2eae549c78a6c0569f1bc4ce0cf1fc9a, 2ec0d0e010065e3d89c36f27f93ef8a0, 2f0cfe0e136e6c664082aec8adebfed5, 2fcae35f05382bb2df572d386c481225, 31d2b35738603fa507f5548760dd3880, 321c1d36c16833477ada58ccfa012c6e, 369a584ca191bede6f06902514d2981f, 3988ada08cad3b0ca499a0a59f801a31, 3a468a810552c764746e51faea0f6618, 3c5601aad18e12d696f4f71eb783d45a, 3d6fb2c3491b1af461bc06d4bc8570d3, 4026dd5ed58b872ce34c5cc284ca3b85, 405386b0fd12bc0defc9e4e4f4d2ad05, 418a724a81629dbf007c0f1cb1489157, 42283a935d0c2e0ab03bd273f2ca06fe, 42c43b98bbb7fdfffc6adf7dbade7b31, 441abe0f31ecd32c88b5ee744fbeb39a, 46869e9c38f8b6a9517b41d7378399b9, 4b9682fe146bd3a175249b35931015b3, 4bb856e7e72eb07dfb17ea1b48d78c00, 4c1ad55784314eaa686e7f356b176e44, 4df52f0b5f4115981925c2e8776c67e1, 4eaefd903a1b032b672f2e9ca0fd30fd, 56e11c88636ae745bc5b494a3ed10c21, 5aa8efccaf6955e6949977a96c2cb0c2, 5c6ebc8464b7542c1f12672d246120ab, 5cc51334f9ebfef5a7c4e086e9be6f03, 5cce2e0022043e50adfed6cdac95a646, 6049a8d4403d0ca253b292b9a9b6c9bf, 637c9cd17fc8f42910d536b46ed3b445, 642b12cdda124e1f70b548d126600f98, 69416c1d9ba670884a591a2a2a4cbd90, 6a6d74909409806484d8c7068eb67a9b, 6e5ce12a851cb951c4bf4d26a6c03952, 6f97211bcb0db4a0b3ffe7e724558208, 6ffc7d5de1f9aeed579c136b124cc520, 70709e848bf713dbce8e546ca276374c, 72170d6fef5a705b0bbcbaf1090c4fe4, 740ee2f9db0e4b87726f21970cf9736b, 762ccfb89414ffe1161a4c2971393a4f, 76de8cb0c21664dbc8d47fc95ad7f318, 79505fe24b04b17fe76dfe07ce0c5757, 79bbfe7f2b8535f478d0e1686f985387, 7fbc32049beb9220d9149e940e0889c6, 8030ab29b6fdd365491945b8408c9232, 810f2d6eccccc5f034f0ee91743c1608, 822800bf9d8b01147d93f062a5406015, 8246f1544802be1fe11914343211cee7, 82a3562065a0b19709992b4e546bc256, 82cf758f36235de026f67780d0715eec, 8c8680f9c095f8a49ea9a13bf5a9d44d, 8fa25684851d745a0c4d8f79c23937d1, 910188665f259831b54364935afcf29c, 93abea0c1f49416a68aed520efbb94a5, 98367c9495dde69c8ec5a74a380c2cd1, 98ad062160371d52949bfcd254cdb721, 9962800c103eee89d140de26c3ee20e6, 9979ca5b95b8ca66dd173a6e83999ade, 99810930c321f76b8fab2f8ccc87e826, 9c6c697f4fbe5cc3c5c8900cbb390ed1, a31e0854011a7a784d11989b095e3927, a37c9bfc16a5d22fee96052c230147ab, a63b68293610423fbfd031562d910899, ab7ebcb0a107d92c8dc9b5615894e97f, ac157fff310a45cba1933c432a22bdf7, af68de5484060fc36e616c725d04bb65, b4179cce7ee9f72854a3f3ce86614693, b4a780189d128e0390c4cd391ffce553, b726acb27a9401b892da63444d83e98b, b74f559a3bfe758f4d1ebac83aed7f3b, ba80c4a5e5d153c1c1c39c258bc2c8f0, be6fc91ff090d0d06fec596876082de1, c116cd083284cc599c024c3479ca9b70, c184987c8b8dc8f25b3b493b22bc9574, c367fc00095df2320b1cc65d89604e51, c3782528967a690f7c212c06a6ee70a3, c3d8996eb28fe6f6e599429824ea5646, c3f8b1ce2f9dc658e4a9ff198aabeb52, c67ac21cfeab6866eb55dfc9c4f73670, cc7b091b94c4f0641b180417b017fec2, cddfa154bbe89d4627210eba087c3504, d002c008d9de2e5243cdc3156ccb6bbb, d21e8cc11bb219a032ae2109ddaa3260, dc78d92d10b486db9b610920959107e1, fba77d065b27ed48347d545e712d2913, fe0bbe5f1443d7d065497cfabae083e7, fe2556ec12488e4e444bc0ea223b5038, fe7ad454510a396448ecb128e27eb5ba, 989348bab6337f1aa81df58ca7b170c6, 0db816719971734e20498eb038ba9bff, 213b8b761942893ade5ab9e36926c0e1, 70e5187bb4edcef3189a3864e89df3e1, d41d8cd98f00b204e9800998ecf8427e, 69b7c08a2e149ceb4f6ff9bd61f14290, e23b8c8978bb4ebe97f92edc381b51d4, 206d1b96d32ab8473a19569e1786be55, 23dd8b4ff96ba21a5472ca4ee33c568e, 34c139306fcf1b9ea0cc256d359f5370, 3b4a5a868cec99ae01f6b4e55197de87, 51be9a836c8d141861a14976ebc7a669, 85fe0a86b84d2fdc82d00cd327602d96, 9170eb01f97b88f27309c4a9dbb0c4d2, 940ab1768ab6d7c21467e169197559e6, bcb62952dcca930983631cbdab157565, c0feef16835da391c2944e6c7458628b, d5fbf18a8a0744057f6608dddea8648f, e86c0a5f943ecbae0c6409826577a8a4, f8760bef55200896f88a3aad63a6b417, 3745095be9859492fc9975c66192310d, 581afe167dbdbc03c8921879c4c1efcb, 6722fee46e9805f7f791701b280b6859, 7e40609b0b92f665536706c8390bc923, 85027ccdfc6526cc8ea92065f2a49784, 917a31528c38e0cec2a3e10210235625, a5a171dad65369854e8168fb176b7757, ad07762c8a43b109da05907b22cf5ebf, be62bdb49564acfdaeba4fbb29200e5d, dc9207ad7e0d1678e96c89ac1bf19354, ef20f30f7542d7636156a93e67e59813, f5e2d9b3ca32eaac5e53756c415e43f5, 02c47b2fa946ee8d5b5a75ec0c75fd47, 047d5a67baf55f3faa25f2891bd3d160, 04ae31efe7ef8caa43c09a6db37cd4f4, 09dc5ba3ba5f22a427f69e8290e54743, 10a16457e00cf426426acfa7e821a34b, 13ae229f9d176d2e243d0d306a881073, 162497b687948d948e8a0b21fdf74d8c, 173ab81ab1c2dd074f7a6f29fa8d1fd9, 188bc7e4830572e60fc7b193d4ead4af, 1a91dd542ff52d3dd36a06df33c6ea4e, 23b505a976ead36ac9b7f5e236b850dd, 272bf85e808eb156cd19ccdbdb218af0, 27abdd7950d4aa35cc1e8a4936a120fe, 2c9135c3b77d70b96f11dc8da53d283f, 369a0d978b1379de242518b9e19a8ba2, 67633cb99fdeed9f2a393e3bce975a7e, 6948523800f948dc533b671a56b09984, 73d95eb087d3913e2c36c0381122076d, 7d9c1f28eb4d1801e413dc97eb2fdd3f, 7e916924805997bb33648fca45c1e9af, 801f560beacd22f9035c49b40750228c, 8230f8983318d678eec3c930e3f39252, 83e30c9d27ce740ce886319e2ec84270, 8832ab0813ec23393fea4656fae1c100, 8874567c55128ac62b468d5adce0dd63, 8fa1b8035ea42d84540070fd3004932b, 93e1dd7025e01abacd88c9327ec2e328, 9f1657433aa5d13fd69107aff4239053, a684e2b7d11cdc26f461f6c2dbf2e2fb, ac08ced7e036e44d1f713833d54a20e2, cc47ea2da6e1bbed36b023d36a6ea7bd, d3d44eb926bbd671c8f57ca4543852e8, db4df216e748ae17881a5b6a3ec747fb, ec83d8379140396c8a18368af9d18421, ece9f967c757549ebf3124957c9146ef, eeb631127f1b9fb3d13d209d8e675634, f86b88c23ddbf6d61e6698a0a785c46f, fa816236701d93b09ea9e883b449fa33, fce36fa87e435c4412899103ef757d24, 5d94c15ef5d9da90c83b7e74bf1f82ec, 750af815bada07e8913a9d37e3664c7e, 59ed226e16b896ff191556438bfb491d, 5bfcf21334d9786205982c166db08d6a, 5d837415380f648c0dbd8c26c36f5dec, 1abbd53263fffaa8d97ccc67f5b3dea1, 2b88f6504fd54bbc454031f255a97cdf, 2ff2d518313475a612f095dd863c8aea, 4e432ad824484d5d22a2f2198a1f046d, 5bca1a86c15816f3fc61db1ae807bdca, 7c6722e3d52a578a080ac35de81c2e8e, 7fbc32049beb9220d9149e940e0889c6, 86d0ee79da98f54e4a3990f4139f3227, 9f558ac48f34366dc43f2b8f62d0bb11, e7cb47b44f1953f7ca07b0616b1310b3, 7e6c8992026a79c080f88103f6a69d2c, b4f62b9440316c1f5877b4d773c44fe9, ac71a6c9068d4fc1974ceb0784a541f3, 3a468a810552c764746e51faea0f6618, 0ed4dc6fe7938a5477a65a5a49e5392d, 241aa4c773ffeed4f73f90da9cd4b3c2, 1abbd53263fffaa8d97ccc67f5b3dea1, 4dd49174d6bc559105383bdf8bf0e234, 507aed81e3106da8c50efb3a045c5e2b, 6b2781eefceca4373037d094228a8c17, 90ec28c570dd9dca04d0e8b6d4ab6855, a405e831abb3ec378c33b80638b229de, a87a9ccca492bb23ce3985462219c194, d22f5f14f573293231f04cc53fee17f9, 1abbd53263fffaa8d97ccc67f5b3dea1, 90ec28c570dd9dca04d0e8b6d4ab6855, 69b7c08a2e149ceb4f6ff9bd61f14290, 7c6722e3d52a578a080ac35de81c2e8e, b29265a6932e1fc4dee6fa6908413a50, d5f69a21bcc84e34b0df9d36ea5891d5, e7cb47b44f1953f7ca07b0616b1310b3, 0237959096e10240f1c84828cb66d033, 1a49878c6d1902ad9cdd8bc84c0842f0, 2f0cfe0e136e6c664082aec8adebfed5, 4bb856e7e72eb07dfb17ea1b48d78c00, 5cce2e0022043e50adfed6cdac95a646, c3d8996eb28fe6f6e599429824ea5646, dc78d92d10b486db9b610920959107e1, fe2556ec12488e4e444bc0ea223b5038, 5cd3f073caac28f915cf501d00030b31, 2bc9bfcc2127b50b703aeb4ac35556c5, 31d0e421894004393c48de1769744687, 40f1b160b88ff98934017f3f1e7879a5, 483f96c48280b7eafe362d22c992d9ca, 53b85fe8cde19c42f06ab40d928908d0, 66a2f4470913020780853bb06ef44b2f, 6722fee46e9805f7f791701b280b6859, 83006ac9fb73bc2b891f36dd2f759230, 83a6a209e3074ee9f7aa9d0a97aca426, 8b583ad626a40c09f925af8fd1fd21c2, 93e1dd7025e01abacd88c9327ec2e328, 940e24a84f799b8e8a6417bf64a3bcdf, 989348bab6337f1aa81df58ca7b170c6, ae59ce2bd2f8be170f8421133b6e48c0, bbd9acdd758ec2316855306e83dba469, c116cd083284cc599c024c3479ca9b70, cc7b091b94c4f0641b180417b017fec2, cddfa154bbe89d4627210eba087c3504, d77e1adbe8dd7f6a55735a3b6c405424, e23b8c8978bb4ebe97f92edc381b51d4, 0d76bc28e20e775cd48eaa1003b733b8, 2820d46ed581890e02307dec46841f87, 2ff2d518313475a612f095dd863c8aea, 42c43b98bbb7fdfffc6adf7dbade7b31, 4e432ad824484d5d22a2f2198a1f046d, 50af349c69ae4dec74bc41c581b82459, 5d837415380f648c0dbd8c26c36f5dec, 79505fe24b04b17fe76dfe07ce0c5757, 7cffd679599fb8579abae8f32ce49026, 822800bf9d8b01147d93f062a5406015, b4179cce7ee9f72854a3f3ce86614693, b4a780189d128e0390c4cd391ffce553, ba80c4a5e5d153c1c1c39c258bc2c8f0, bd205aa0f78565a0a54c067a30755656, be6fc91ff090d0d06fec596876082de1, cabde950b208a30fddd788cafbb2b98e, dc73aa0b5f4fc1c7f9f7a754b72763dc, f1f48360f95e1b43e9fba0fec5a2afb8, f43faec42c367d3c8ea3c6b193398ed0, 17a257fa5dba9c9adc4a0e7c29e19581, aeaf03ec13bb911aca1829a30a52d33f, 85027ccdfc6526cc8ea92065f2a49784, 886027253f79a57fc0b4e9dd197e27bb, 9f558ac48f34366dc43f2b8f62d0bb11, 751958396275a78b2102db45a5425f59, 2385b332637dd37e4e5c79a1fed46171, 7fbc32049beb9220d9149e940e0889c6, 4dd49174d6bc559105383bdf8bf0e234, 8dacca7dd24844935fcd34e6c9609416, 52fd61fb95c131d1ebda22fac828d743, 9962800c103eee89d140de26c3ee20e6, ec0ef3ad57f018ff8d79e7275b470efd, 832bc5aac066fae265bc40fa104a0d2e, 581e047bf0d68696757221b9b4fcc3b0, b912bbdfa58fb1aab886f4f0b191625e, f8f051b688e9ea194650e8b7482b4773, 9235b29c859c8f25c25052c0a70ff171, ef9d8cd06de03bd5f07b01c1cce9761f, c2fd460d5734dac2baf533576804c85e, 42c43b98bbb7fdfffc6adf7dbade7b31, c116cd083284cc599c024c3479ca9b70, 901fa02ffd43de5b2d7c8c6b8c2f6a43, 4b2f7c57a9f9794924c62710ee53593f, cc7b091b94c4f0641b180417b017fec2, cc1a806d25982acdb35dd196ab8171bc, 7d9c1f28eb4d1801e413dc97eb2fdd3f, 49ebb14a70500654d4de8c2892ffabfd, 581afe167dbdbc03c8921879c4c1efcb, 6722fee46e9805f7f791701b280b6859, 917a31528c38e0cec2a3e10210235625, 91f05e62ea2dfe40745801af536752e4, a5a171dad65369854e8168fb176b7757, a74f8bb071de766f259fbbce20949429, b2c56689e789118fb361fa86435253ac, c915b7ab378ce9e9115b1458543181d6, 10af3275e1c5b6adb1503808f0a6457d, 8ae2468d3f208d07fb47ebb1e0e297d7, ee74163a463c9c76380848c3b4e666d7, 00fdb6ad7345c0912ea9d2fa4c49950e, d376f29dc8a1c6fd4b8849c9d57e3e03, 90e82cce933bdf8f2c5748ced9ed0cb4, 78e9de71580ecabf1b3569bd638ad372, 11489d15437a46ef41467b838e2300b5, 5d94c15ef5d9da90c83b7e74bf1f82ec, 8e41afd70c03394dfe309f28c49d3727, deaa7537d10ac0916432c062cc14e52e, 2c9135c3b77d70b96f11dc8da53d283f, 2b88f6504fd54bbc454031f255a97cdf, 6e7491e0ef07500a7492fd39edc7171f, b4f62b9440316c1f5877b4d773c44fe9, 0371392c0fd68d34552fa17aea1c6c6e, dcb3c00cfd6cd0f8526bfe335bbbb198, 04f7b0d1c1df1e1161db931c0431a00e, 0de2dc76a10d583f2d8c5c1e780a7f39, b60b6387fb18df16e563a5e1b374e080, 1a14bd60f4c49d1aebd245968a3a654f, 27d74947440dfcc91cb48dd2caa97375, 86d0ee79da98f54e4a3990f4139f3227, 423eaeff2a4576365343e6dc35d22042, 37eec1a29d316ed1e5e766b599dc32a1, 806be9727b07ca222991fb19c4a68207, 4340377b951ded097a9a6b77c882465f, 1abbd53263fffaa8d97ccc67f5b3dea1, a87a9ccca492bb23ce3985462219c194, 0317203dfb69e5a1977e71701cdac0e0, 09c129a0c7af6b98902d18ad8d154c54, 0bf5e206b4058887633ad8a3e7e0bdea, 0c51dcf7fbda4d98cee2fa798eb08bd9, 1a49878c6d1902ad9cdd8bc84c0842f0, 28917fb1d33bd636f03a90a5c5c8ffeb, 3988ada08cad3b0ca499a0a59f801a31, 5cce2e0022043e50adfed6cdac95a646, 6049a8d4403d0ca253b292b9a9b6c9bf, 8030ab29b6fdd365491945b8408c9232, a63b68293610423fbfd031562d910899, af68de5484060fc36e616c725d04bb65, bcb62952dcca930983631cbdab157565, 0371392c0fd68d34552fa17aea1c6c6e, 0db816719971734e20498eb038ba9bff, 70e5187bb4edcef3189a3864e89df3e1, be6fc91ff090d0d06fec596876082de1, d41d8cd98f00b204e9800998ecf8427e, 7c6722e3d52a578a080ac35de81c2e8e, 42b8771ba551694fec95b1ae79c2f7f8, ac157fff310a45cba1933c432a22bdf7, c116cd083284cc599c024c3479ca9b70, 90ec28c570dd9dca04d0e8b6d4ab6855, 38e0e7d95ef07f6ae514b1c883884c9b, f6934324c6f185f3e4ecf0878fc78203, 6500980139ef85404c1b43255a021d20, e2cd4b5df466a20b57aef3675a9e0643, 1abbd53263fffaa8d97ccc67f5b3dea1, 0118b883da6b6b10e0298ec1c5f1a4b9, 0d57d2bef1296be62a3e791bfad33bcd, 1cbefab3fb1025721b5a08686e0dc1e6, 218424312c2811a9a9e77624343babd9, 2e5948ccf01101dd41f84aa4b2c68b27, 3dfbc4f159c03c61195951a7d3b5caee, 49748f2de108dc693fe938ab7e2c494a, 5227ab275e04affdbc7dd7902e1d5aad, 551ad5248aca220ee2e9e87e4e4ccb66, 56f0e67d981024ddcc215543698f44fb, 5d837415380f648c0dbd8c26c36f5dec, 61fedbe1e83380d6ff03eba09e3fc9ae, 6500980139ef85404c1b43255a021d20, 74fa8ec55482ca81b41dfd356af9b187, 9f1657433aa5d13fd69107aff4239053, a1b7f00a611e15ad4011edf135e59f5a, a1c0c364e02b3b1e0e7b8ce89b611b53, b030c619bb24804cbcc05065530fcf2e, d27fba266b27eb415cb3073880ecb2b9, e978cb81b8f630320a1afa58e66a1673, f6c71cab2705f5d66bf11d221f0fbd31, f8a370de9233d27fed89ce7a7f7a03d1, 6500980139ef85404c1b43255a021d20, 2b1522d617f29c4f4210649e2b7773da, 2385b332637dd37e4e5c79a1fed46171, 581e047bf0d68696757221b9b4fcc3b0, 705d7d0374ced8959f5352f4f2c6cb3f, a18b748564f67ead58ece5b679b8a8f6, b66912f5befda0dd4442dedf6f5be14d]
[]
https://www.threatcrowd.org/listMalware.php?antivirus=plugx
```

## Domains
You can use the `api.v2.DomainsAPI` class to fetch data about a domain from Threatcrowd's public API. Example usage:

```java
DomainsAPI api = new DomainsAPI();

try {
  DomainResponse response = api.getDomain("aoldaily.com");

  System.out.println(response.getResponseCode());
  System.out.println(response.getHashes());
  System.out.println(response.getEmails());
  System.out.println(response.getSubdomains());
  System.out.println(response.getReferences());
  System.out.println(response.getVotes());
  System.out.println(response.getPermalink());
  System.out.println(response.getResolutions());

} catch (IOException e) {
  e.printStackTrace();
} catch (InterruptedException e) {
  e.printStackTrace();
}
```

Output:
```
1
[]
[domains@virustracker.info, william19770319@yahoo.com]
[media.aoldaily.com, e.aoldaily.com, finance.aoldaily.com, game.aoldaily.com, zone.aoldaily.com, share.aoldaily.com, update.aoldaily.com, flash.aoldaily.com, mail.aoldaily.com, webmail.aoldaily.com, email.aoldaily.com, info.aoldaily.com, auto.aoldaily.com, asdf--auto.aoldaily.com, asdf--Àu0066auto.aoldaily.com, asdf25u0027auto.aoldaily.com, asdfu0027auto.aoldaily.com, asdf--Àauto.aoldaily.com, asdf--Àaaaaaauto.aoldaily.com, asdf--Àfauto.aoldaily.com, asdfauto.aoldaily.com, asdfauto.aoldaily.com, pop.aoldaily.com, ftp.aoldaily.com, smtp.aoldaily.com, ks.aoldaily.com, stratos.aoldaily.com, documents.aoldaily.com, sports.aoldaily.com, news.aoldaily.com, tw.aoldaily.com, www.aoldaily.com]
[httpblog.shadowserver.org201302, httpsto-strategy.comsAppendix-D-Digital-FQDNs.pdf]
-1
https://www.threatcrowd.org/domain.php?domain=aoldaily.com
[Resolution [lastResolved=2017-11-09, ipAddress=-], Resolution [lastResolved=2014-04-01, ipAddress=0.0.0.0], Resolution [lastResolved=2020-07-22, ipAddress=167.88.206.88], Resolution [lastResolved=2020-10-18, ipAddress=18.190.95.243], Resolution [lastResolved=2018-07-27, ipAddress=184.168.221.104], Resolution [lastResolved=2018-05-04, ipAddress=184.168.221.41], Resolution [lastResolved=2018-05-05, ipAddress=184.168.221.56], Resolution [lastResolved=2019-05-17, ipAddress=184.168.221.65], Resolution [lastResolved=2019-05-16, ipAddress=184.168.221.67], Resolution [lastResolved=2019-05-29, ipAddress=184.168.221.74], Resolution [lastResolved=2019-05-09, ipAddress=184.168.221.76], Resolution [lastResolved=2019-05-22, ipAddress=184.168.221.82], Resolution [lastResolved=2019-05-16, ipAddress=184.168.221.85], Resolution [lastResolved=2020-11-08, ipAddress=3.12.202.18], Resolution [lastResolved=2020-10-06, ipAddress=3.128.208.230], Resolution [lastResolved=2020-11-02, ipAddress=3.129.252.224], Resolution [lastResolved=2020-10-15, ipAddress=3.131.184.38], Resolution [lastResolved=2020-11-14, ipAddress=3.134.22.63], Resolution [lastResolved=2020-11-05, ipAddress=3.138.72.189], Resolution [lastResolved=2020-09-30, ipAddress=3.18.25.61], Resolution [lastResolved=2020-10-09, ipAddress=3.18.65.24], Resolution [lastResolved=2020-10-27, ipAddress=3.22.191.41], Resolution [lastResolved=2020-08-21, ipAddress=47.245.10.59], Resolution [lastResolved=2013-09-03, ipAddress=50.116.42.33], Resolution [lastResolved=2019-06-13, ipAddress=50.63.202.64], Resolution [lastResolved=2019-06-07, ipAddress=50.63.202.65], Resolution [lastResolved=2019-06-10, ipAddress=50.63.202.66], Resolution [lastResolved=2013-09-20, ipAddress=50.63.202.70], Resolution [lastResolved=2019-05-14, ipAddress=50.63.202.93], Resolution [lastResolved=2017-01-04, ipAddress=52.4.209.250], Resolution [lastResolved=2019-05-08, ipAddress=52.58.78.16], Resolution [lastResolved=2018-06-18, ipAddress=54.208.77.124], Resolution [lastResolved=0000-00-00, ipAddress=66.228.48.134], Resolution [lastResolved=2015-05-12, ipAddress=69.195.129.70], Resolution [lastResolved=2016-11-26, ipAddress=69.195.129.72], Resolution [lastResolved=2013-12-02, ipAddress=81.166.122.234]]
```

## Email Addresses
You can use the `api.v2.EmailAddressesAPI` class to fetch data about an email address from Threatcrowd's public API. Example usage:

```java
EmailAddressesAPI api = new EmailAddressesAPI();
EmailResponse resp;
try {
  resp = api.getEmail("william19770319@yahoo.com");

  System.out.println(resp.getResponseCode());
  System.out.println(resp.getDomains());
  System.out.println(resp.getReferences());
  System.out.println(resp.getPermalink());
} catch (IOException e) {
  e.printStackTrace();
} catch (InterruptedException e) {
  e.printStackTrace();
}
```

Output:
```
1
[aoldaily.com, aunewsonline.com, cnndaily.com, usnewssite.com]
[]
https://www.threatcrowd.org/email.php?email=william19770319@yahoo.com
```

## IP Addresses
You can fetch data about an IP Address by using the `api.v2.IPAddressAPI` class. Example usage:

```java
IPAddressAPI api = new IPAddressAPI();

try {
  IPAddressResponse resp = api.getIPAddress("188.40.75.132");

  System.out.println(resp.getResponseCode());
  System.out.println(resp.getResolutions());
  System.out.println(resp.getHashes());
  System.out.println(resp.getReferences());
  System.out.println(resp.getVotes());
  System.out.println(resp.getPermalink());
} catch (IOException e) {
  e.printStackTrace();
} catch (InterruptedException e) {
  e.printStackTrace();
}
```

Output:
```
1
[Resolution [lastResolved=2015-02-17, ipAddress=tvgate.rocks], Resolution [lastResolved=2015-02-17, ipAddress=nice-mobiles.com], Resolution [lastResolved=2015-02-17, ipAddress=nauss-lab.com], Resolution [lastResolved=2015-02-17, ipAddress=iwork-sys.com], Resolution [lastResolved=2015-02-17, ipAddress=linkedim.in], Resolution [lastResolved=2015-02-17, ipAddress=fpupdate.info], Resolution [lastResolved=2015-02-17, ipAddress=ineltdriver.com], Resolution [lastResolved=2015-02-17, ipAddress=flushupdate.com], Resolution [lastResolved=2015-02-17, ipAddress=flushupate.com], Resolution [lastResolved=2015-02-17, ipAddress=ahmedfaiez.info], Resolution [lastResolved=2014-02-14, ipAddress=advtravel.info], Resolution [lastResolved=2014-05-27, ipAddress=nartu.de], Resolution [lastResolved=2015-02-19, ipAddress=www.fpupdate.info], Resolution [lastResolved=2014-03-22, ipAddress=advtravel.info], Resolution [lastResolved=2014-06-08, ipAddress=ahmedfaiez.info], Resolution [lastResolved=2014-08-22, ipAddress=flushupate.com], Resolution [lastResolved=2014-11-07, ipAddress=ineltdriver.com], Resolution [lastResolved=2015-09-21, ipAddress=gbartu.de], Resolution [lastResolved=2015-09-28, ipAddress=vartu.de], Resolution [lastResolved=2020-08-30, ipAddress=ns1.atyafhosting.info], Resolution [lastResolved=2020-08-30, ipAddress=ns2.atyafhosting.info], Resolution [lastResolved=2020-11-06, ipAddress=static.132.75.40.188.clients.your-server.de], Resolution [lastResolved=2020-11-10, ipAddress=188.40.75.132]]
[003f0ed24b5f70ddc7c6e80f9c4dac73, 027fc90c13f6d87e1f68d25b0d0ec4a7, 088420b7e56c73d3d495230d42e0cb95, 1e52a293838464e4cd6c1c6d94a55793, 2219f3941603262dc3478c60df3b02f6, 238b48338c14c8ea87ff7ccab4544252, 2607abe604832363514eb58c33a682fc, 2986d9af413cd09d9ffdb40040e5c180, 2b3baed817a79109824d3a8a94f6c317, 2bce2ccd484a063e5e432a6f651782d9, 4377b17d7984838993b998c4bab97925, 4907a68a3ff0f010ed74214f957746c0, 63c480b1cc601b02b4acb30309b007e6, 686779709226c6727bd9ebc4b1ff21b1, 6b4248a01a26ff07a85b5316702a2f5f, 7075c9a874ab5b0c27942714394f3885, 73c46bacc471db08a6c0e31caef3f9e8, 74d8b882efae9fea1787f1558589fecb, 76f74b24480bc1a42998c9440ddc2fad, 7ac102b740b299824e34394f334b5508, 7ed79032a1ad8535242428e69507ca0a, 8a9b52ff90bbd585907694e68551b991, 8bbad466f2257e05f66ece621ccf2056, 9469ff12c582cf7943582dd28a1920cc, a0b76ea08917a9dd785a0a1a6ae6eebe, a4a390f90be49b2bb51194d0844fed7f, a59399c7608d140dc9cb5dffcb46f1d9, aefea9d795624da16d878dc9bb81bf87, b08a67892d2198aeb2826b398f8c6c74, bd54d70d473d45b75cc8bf1fbe6fa022, d048a6a8377a865f07cbc2429ffaa3e7, dff746868a1559de9d25037e73c06c52, e1d2543aba350a83c968872fbe957d85, f3d6bb7addc88ad45f79c5199f8db2e0, f78fcd4eaf3d9cd95116b6e6212ad327, fa6fbd1dd2d58885772bd0b37633d5d7]
[]
-1
https://www.threatcrowd.org/ip.php?ip=188.40.75.132
```

## Report
To fetch an report by an ID from Threatcrowd's public API, you can use the `api.v2.ReportAPI` class. Example usage:

```java
ReportAPI api = new ReportAPI();
try {
  ReportResponse resp = api.getReport("ec8c89aa5e521572c74e2dd02a4daf78");

  System.out.println(resp.getResponseCode());
  System.out.println(resp.getMd5());
  System.out.println(resp.getSha1());
  System.out.println(resp.getScans());
  System.out.println(resp.getIps());
  System.out.println(resp.getDomains());
  System.out.println(resp.getReferences());
  System.out.println(resp.getPermalink());
} catch (IOException e) {
  e.printStackTrace();
} catch (InterruptedException e) {
  e.printStackTrace();
}
```

Output:
```
1
ec8c89aa5e521572c74e2dd02a4daf78
01f5c3905f2098650f16f50a1b26156586238bfe
[, Trojan/W32.Small.34304.EG, Trojan.Win32.Cossta!O, Trojan ( 001922ff1 ), Trojan ( 001922ff1 ), Trojan.Win32.Cossta.cqvyn, APT1.A, TSPY_COSSTA.DH, WIN.Trojan.Cossta-4, Trojan.Win32.Cossta.grt, Trojan.Cossta!dfgiLGS/u08, Trojan.Win32.A.Cossta.34304.A, UnclassifiedMalware, TR/Offend.4596108, TSPY_COSSTA.DH, Mal/Dloadr-BK, Trojan/Cossta.rg, Trojan/Win32.Cossta, Win32.Troj.Cossta.(kcloud), Backdoor:Win32/Neunut.A, Trojan/Win32.Cossta, Trojan.Cossta, Trojan.Win32.Cossta.abv, W32/Cossta.WQS!tr, Win32/Trojan.734]
[0.0.0.0]
[ks.aoldaily.com]
[]
https://www.threatcrowd.org/malware.php?md5=ec8c89aa5e521572c74e2dd02a4daf78
```
