cmake_minimum_required(VERSION 3.4.1)

SET(CMAKE_CXX_FLAGS "-D__ANDROID_API__=17 -DHAVE_LIBLEPT -DHAVE_JNIGRAPHICS -DANDROID_STL=gnustl_static -DUSE_STD_NAMESPACE -fexceptions -frtti")

file(GLOB tesseract_src ../tesseract-3.00)

add_library( # Sets the name of the library.
             tess

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).

             ${tesseract_src}/viewer/scrollview.cpp 
             ${tesseract_src}/viewer/svutil.cpp 
             ${tesseract_src}/viewer/svmnode.cpp 
             ${tesseract_src}/viewer/svpaint.cpp

             ${tesseract_src}/ccutil/ambigs.cpp 
             ${tesseract_src}/ccutil/basedir.cpp
             ${tesseract_src}/ccutil/bits16.cpp
             ${tesseract_src}/ccutil/boxread.cpp
             ${tesseract_src}/ccutil/clst.cpp
             ${tesseract_src}/ccutil/debugwin.cpp
             ${tesseract_src}/ccutil/elst.cpp
             ${tesseract_src}/ccutil/elst2.cpp
             ${tesseract_src}/ccutil/errcode.cpp
             ${tesseract_src}/ccutil/globaloc.cpp
             ${tesseract_src}/ccutil/hashfn.cpp
             ${tesseract_src}/ccutil/mainblk.cpp
             ${tesseract_src}/ccutil/memblk.cpp
             ${tesseract_src}/ccutil/memry.cpp
             ${tesseract_src}/ccutil/mfcpch.cpp
             ${tesseract_src}/ccutil/ocrshell.cpp
             ${tesseract_src}/ccutil/scanutils.cpp
             ${tesseract_src}/ccutil/serialis.cpp
             ${tesseract_src}/ccutil/strngs.cpp
             ${tesseract_src}/ccutil/tessdatamanager.cpp
             ${tesseract_src}/ccutil/tessopt.cpp
             ${tesseract_src}/ccutil/tordvars.cpp
             ${tesseract_src}/ccutil/tprintf.cpp
             ${tesseract_src}/ccutil/unichar.cpp
             ${tesseract_src}/ccutil/unicharset.cpp
             ${tesseract_src}/ccutil/unicharmap.cpp
             ${tesseract_src}/ccutil/varable.cpp
             ${tesseract_src}/ccutil/ccutil.cpp

             ${tesseract_src}/cutil/tessarray.cpp
             ${tesseract_src}/cutil/bitvec.cpp
             ${tesseract_src}/cutil/danerror.cpp
             ${tesseract_src}/cutil/efio.cpp
             ${tesseract_src}/cutil/emalloc.cpp
             ${tesseract_src}/cutil/freelist.cpp
             ${tesseract_src}/cutil/globals.cpp
             ${tesseract_src}/cutil/listio.cpp
             ${tesseract_src}/cutil/oldheap.cpp
             ${tesseract_src}/cutil/oldlist.cpp
             ${tesseract_src}/cutil/structures.cpp
             ${tesseract_src}/cutil/cutil.cpp
             ${tesseract_src}/cutil/cutil_class.cpp

             ${tesseract_src}/dict/choices.cpp 
             ${tesseract_src}/dict/context.cpp
             ${tesseract_src}/dict/conversion.cpp
             ${tesseract_src}/dict/dawg.cpp
             ${tesseract_src}/dict/dict.cpp
             ${tesseract_src}/dict/hyphen.cpp
             ${tesseract_src}/dict/permdawg.cpp
             ${tesseract_src}/dict/permngram.cpp
             ${tesseract_src}/dict/permute.cpp
             ${tesseract_src}/dict/states.cpp
             ${tesseract_src}/dict/stopper.cpp
             ${tesseract_src}/dict/trie.cpp

             ${tesseract_src}/image/image.cpp
             ${tesseract_src}/image/imgbmp.cpp
             ${tesseract_src}/image/imgio.cpp
             ${tesseract_src}/image/imgs.cpp
             ${tesseract_src}/image/imgtiff.cpp
             ${tesseract_src}/image/bitstrm.cpp
             ${tesseract_src}/image/svshowim.cpp

             ${tesseract_src}/ccstruct/blobbox.cpp
             ${tesseract_src}/ccstruct/blobs.cpp
             ${tesseract_src}/ccstruct/blread.cpp
             ${tesseract_src}/ccstruct/callcpp.cpp
             ${tesseract_src}/ccstruct/ccstruct.cpp
             ${tesseract_src}/ccstruct/coutln.cpp
             ${tesseract_src}/ccstruct/detlinefit.cpp
             ${tesseract_src}/ccstruct/genblob.cpp
             ${tesseract_src}/ccstruct/labls.cpp
             ${tesseract_src}/ccstruct/linlsq.cpp
             ${tesseract_src}/ccstruct/lmedsq.cpp
             ${tesseract_src}/ccstruct/mod128.cpp
             ${tesseract_src}/ccstruct/normalis.cpp
             ${tesseract_src}/ccstruct/ocrblock.cpp
             ${tesseract_src}/ccstruct/ocrrow.cpp
             ${tesseract_src}/ccstruct/otsuthr.cpp
             ${tesseract_src}/ccstruct/pageres.cpp
             ${tesseract_src}/ccstruct/pdblock.cpp
             ${tesseract_src}/ccstruct/points.cpp
             ${tesseract_src}/ccstruct/polyaprx.cpp
             ${tesseract_src}/ccstruct/polyblk.cpp
             ${tesseract_src}/ccstruct/polyblob.cpp
             ${tesseract_src}/ccstruct/polyvert.cpp
             ${tesseract_src}/ccstruct/poutline.cpp
             ${tesseract_src}/ccstruct/quadlsq.cpp
             ${tesseract_src}/ccstruct/quadratc.cpp
             ${tesseract_src}/ccstruct/quspline.cpp
             ${tesseract_src}/ccstruct/ratngs.cpp
             ${tesseract_src}/ccstruct/rect.cpp
             ${tesseract_src}/ccstruct/rejctmap.cpp
             ${tesseract_src}/ccstruct/statistc.cpp
             ${tesseract_src}/ccstruct/stepblob.cpp
             ${tesseract_src}/ccstruct/vecfuncs.cpp
             ${tesseract_src}/ccstruct/werd.cpp

             ${tesseract_src}/classify/adaptive.cpp
             ${tesseract_src}/classify/adaptmatch.cpp
             ${tesseract_src}/classify/baseline.cpp
             ${tesseract_src}/classify/blobclass.cpp
             ${tesseract_src}/classify/chartoname.cpp
             ${tesseract_src}/classify/classify.cpp
             ${tesseract_src}/classify/cluster.cpp
             ${tesseract_src}/classify/clusttool.cpp
             ${tesseract_src}/classify/cutoffs.cpp
             ${tesseract_src}/classify/extract.cpp
             ${tesseract_src}/classify/featdefs.cpp
             ${tesseract_src}/classify/flexfx.cpp
             ${tesseract_src}/classify/float2int.cpp
             ${tesseract_src}/classify/fpoint.cpp
             ${tesseract_src}/classify/fxdefs.cpp
             ${tesseract_src}/classify/intfx.cpp
             ${tesseract_src}/classify/intmatcher.cpp
             ${tesseract_src}/classify/intproto.cpp
             ${tesseract_src}/classify/kdtree.cpp
             ${tesseract_src}/classify/mf.cpp
             ${tesseract_src}/classify/mfdefs.cpp
             ${tesseract_src}/classify/mfoutline.cpp
             ${tesseract_src}/classify/mfx.cpp
             ${tesseract_src}/classify/normfeat.cpp
             ${tesseract_src}/classify/normmatch.cpp
             ${tesseract_src}/classify/ocrfeatures.cpp
             ${tesseract_src}/classify/outfeat.cpp
             ${tesseract_src}/classify/picofeat.cpp
             ${tesseract_src}/classify/protos.cpp
             ${tesseract_src}/classify/speckle.cpp
             ${tesseract_src}/classify/xform2d.cpp

             ${tesseract_src}/textord/alignedblob.cpp
             ${tesseract_src}/textord/blkocc.cpp
             ${tesseract_src}/textord/bbgrid.cpp
             ${tesseract_src}/textord/colfind.cpp
             ${tesseract_src}/textord/colpartition.cpp
             ${tesseract_src}/textord/colpartitionset.cpp
             ${tesseract_src}/textord/drawedg.cpp
             ${tesseract_src}/textord/drawtord.cpp
             ${tesseract_src}/textord/edgblob.cpp
             ${tesseract_src}/textord/edgloop.cpp
             ${tesseract_src}/textord/fpchop.cpp
             ${tesseract_src}/textord/gap_map.cpp
             ${tesseract_src}/textord/imagefind.cpp
             ${tesseract_src}/textord/linefind.cpp
             ${tesseract_src}/textord/makerow.cpp
             ${tesseract_src}/textord/oldbasel.cpp
             ${tesseract_src}/textord/pagesegmain.cpp
             ${tesseract_src}/textord/pithsync.cpp
             ${tesseract_src}/textord/pitsync1.cpp
             ${tesseract_src}/textord/scanedg.cpp
             ${tesseract_src}/textord/sortflts.cpp
             ${tesseract_src}/textord/strokewidth.cpp
             ${tesseract_src}/textord/tabfind.cpp
             ${tesseract_src}/textord/tablefind.cpp
             ${tesseract_src}/textord/tabvector.cpp
             ${tesseract_src}/textord/topitch.cpp
             ${tesseract_src}/textord/tordmain.cpp
             ${tesseract_src}/textord/tospace.cpp
             ${tesseract_src}/textord/tovars.cpp
             ${tesseract_src}/textord/underlin.cpp
             ${tesseract_src}/textord/wordseg.cpp
             ${tesseract_src}/textord/workingpartset.cpp

             ${tesseract_src}/wordrec/associate.cpp
             ${tesseract_src}/wordrec/badwords.cpp
             ${tesseract_src}/wordrec/bestfirst.cpp
             ${tesseract_src}/wordrec/chop.cpp
             ${tesseract_src}/wordrec/chopper.cpp
             ${tesseract_src}/wordrec/closed.cpp
             ${tesseract_src}/wordrec/drawfx.cpp
             ${tesseract_src}/wordrec/findseam.cpp
             ${tesseract_src}/wordrec/gradechop.cpp
             ${tesseract_src}/wordrec/heuristic.cpp
             ${tesseract_src}/wordrec/makechop.cpp
             ${tesseract_src}/wordrec/matchtab.cpp
             ${tesseract_src}/wordrec/matrix.cpp
             ${tesseract_src}/wordrec/metrics.cpp
             ${tesseract_src}/wordrec/mfvars.cpp
             ${tesseract_src}/wordrec/olutil.cpp
             ${tesseract_src}/wordrec/outlines.cpp
             ${tesseract_src}/wordrec/pieces.cpp
             ${tesseract_src}/wordrec/plotedges.cpp
             ${tesseract_src}/wordrec/plotseg.cpp
             ${tesseract_src}/wordrec/render.cpp
             ${tesseract_src}/wordrec/seam.cpp
             ${tesseract_src}/wordrec/split.cpp
             ${tesseract_src}/wordrec/tally.cpp
             ${tesseract_src}/wordrec/tessinit.cpp
             ${tesseract_src}/wordrec/tface.cpp
             ${tesseract_src}/wordrec/wordclass.cpp
             ${tesseract_src}/wordrec/wordrec.cpp

             ${tesseract_src}/ccmain/tessedit.cpp
             ${tesseract_src}/ccmain/adaptions.cpp
             ${tesseract_src}/ccmain/ambigsrecog.cpp
             ${tesseract_src}/ccmain/applybox.cpp
             ${tesseract_src}/ccmain/blobcmp.cpp
             ${tesseract_src}/ccmain/callnet.cpp
             ${tesseract_src}/ccmain/charcut.cpp
             ${tesseract_src}/ccmain/charsample.cpp
             ${tesseract_src}/ccmain/control.cpp
             ${tesseract_src}/ccmain/docqual.cpp
             ${tesseract_src}/ccmain/expandblob.cpp
             ${tesseract_src}/ccmain/fixspace.cpp
             ${tesseract_src}/ccmain/fixxht.cpp
             ${tesseract_src}/ccmain/imgscale.cpp
             ${tesseract_src}/ccmain/matmatch.cpp
             ${tesseract_src}/ccmain/osdetect.cpp
             ${tesseract_src}/ccmain/output.cpp
             ${tesseract_src}/ccmain/pagewalk.cpp
             ${tesseract_src}/ccmain/paircmp.cpp
             ${tesseract_src}/ccmain/pgedit.cpp
             ${tesseract_src}/ccmain/reject.cpp
             ${tesseract_src}/ccmain/scaleimg.cpp
             ${tesseract_src}/ccmain/tessbox.cpp
             ${tesseract_src}/ccmain/tesseractclass.cpp
             ${tesseract_src}/ccmain/tessvars.cpp
             ${tesseract_src}/ccmain/tfacepp.cpp
             ${tesseract_src}/ccmain/thresholder.cpp
             ${tesseract_src}/ccmain/tstruct.cpp
             ${tesseract_src}/ccmain/varabled.cpp
             ${tesseract_src}/ccmain/werdit.cpp

             ${tesseract_src}/api/baseapi.cpp

             tessbaseapi.cpp )

if(${ANDROID_ABI} STREQUAL "armeabi")
    include_directories(${ANDROID_SYSROOT}/usr/include/arm-linux-androideabi)
elseif(${ANDROID_ABI} STREQUAL "x86")
    include_directories(${ANDROID_SYSROOT}/usr/include/i686-linux-android)
endif()

include_directories(${tesseract_src}/viewer/)
include_directories(${tesseract_src}/ccutil/)
include_directories(${tesseract_src}/cutil/)
include_directories(${tesseract_src}/dict/)
include_directories(${tesseract_src}/image/)
include_directories(${tesseract_src}/ccstruct/)
include_directories(${tesseract_src}/classify/)
include_directories(${tesseract_src}/textord/)
include_directories(${tesseract_src}/wordrec/)
include_directories(${tesseract_src}/ccmain/)
include_directories(${tesseract_src}/api/)
include_directories(../leptonica-1.69/src/)
include_directories(./)

target_link_libraries( # Specifies the target library.
                       tess

                       # Links the target library to the log library
                       # included in the NDK.
                       -llog
                       -ljnigraphics
                       lept )