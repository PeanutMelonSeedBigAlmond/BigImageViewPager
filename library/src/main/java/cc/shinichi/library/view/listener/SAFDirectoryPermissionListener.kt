package cc.shinichi.library.view.listener

import androidx.documentfile.provider.DocumentFile

interface SAFDirectoryPermissionListener {
    fun onGranted(root: DocumentFile)
}