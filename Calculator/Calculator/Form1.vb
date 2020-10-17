Public Class Form1
    Dim Risultato As Double
    Dim Segno As String


    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles Me.Load

        Risultato = 0

        ' nome bottoni
        Button1.Text = "1"
        Button2.Text = "2"
        Button3.Text = "3"
        Button4.Text = "4"
        Button5.Text = "5"
        Button6.Text = "6"
        Button7.Text = "7"
        Button8.Text = "8"
        Button9.Text = "9"
        Button10.Text = "0"
        Button11.Text = "+"
        Button12.Text = "-"
        Button13.Text = "*"
        Button14.Text = ":"
        Button15.Text = "="

        ' dimensioni bottoni
        Dim Grandezza_df = New Size(50, 50)
        Button1.Size = Grandezza_df
        Button2.Size = Grandezza_df
        Button3.Size = Grandezza_df
        Button4.Size = Grandezza_df
        Button5.Size = Grandezza_df
        Button6.Size = Grandezza_df
        Button7.Size = Grandezza_df
        Button8.Size = Grandezza_df
        Button9.Size = Grandezza_df
        Button10.Size = Grandezza_df
        Button11.Size = Grandezza_df '+
        Button12.Size = Grandezza_df '-
        Button13.Size = Grandezza_df '*
        Button14.Size = Grandezza_df ':
        Button15.Size = New Size(130, 50) '=

        TextBox1.Size = New Size(210, 20)


        ' localizzazione Bottoni

        TextBox1.Location = New Point(30, 20)

        Button1.Location = New Point(30, 60)
        Button2.Location = New Point(110, 60)
        Button3.Location = New Point(190, 60)
        Button4.Location = New Point(30, 140)
        Button5.Location = New Point(110, 140)
        Button6.Location = New Point(190, 140)
        Button7.Location = New Point(30, 220)
        Button8.Location = New Point(110, 220)
        Button9.Location = New Point(190, 220)
        Button10.Location = New Point(30, 300)
        Button11.Location = New Point(280, 60) '+
        Button12.Location = New Point(280, 140) '-
        Button13.Location = New Point(280, 220) '*
        Button14.Location = New Point(280, 300) ':
        Button15.Location = New Point(110, 300) '=

    End Sub


    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        TextBox1.Text = TextBox1.Text + "1"

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        TextBox1.Text = TextBox1.Text + "2"
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        TextBox1.Text = TextBox1.Text + "3"
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        TextBox1.Text = TextBox1.Text + "4"
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        TextBox1.Text = TextBox1.Text + "5"
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
        TextBox1.Text = TextBox1.Text + "6"
    End Sub

    Private Sub Button7_Click(sender As Object, e As EventArgs) Handles Button7.Click
        TextBox1.Text = TextBox1.Text + "7"
    End Sub

    Private Sub Button8_Click(sender As Object, e As EventArgs) Handles Button8.Click
        TextBox1.Text = TextBox1.Text + "8"
    End Sub

    Private Sub Button9_Click(sender As Object, e As EventArgs) Handles Button9.Click
        TextBox1.Text = TextBox1.Text + "9"
    End Sub

    Private Sub Button10_Click(sender As Object, e As EventArgs) Handles Button10.Click
        TextBox1.Text = TextBox1.Text + "0"
    End Sub

    Private Sub Button11_Click(sender As Object, e As EventArgs) Handles Button11.Click
        Try
            If Segno = "Risultato" Then
                TextBox1.Text = ""
                Segno = "+"
            Else

                Segno = "+"
                If Risultato = 0 Then
                    Risultato = CDbl(TextBox1.Text)
                Else
                    Risultato = Risultato + CDbl(TextBox1.Text)
                End If
                TextBox1.Text = ""
            End If
        Catch ex As Exception
            MsgBox("operazione impossibile")
        End Try

    End Sub

    Private Sub Button12_Click(sender As Object, e As EventArgs) Handles Button12.Click
        Try
            If Segno = "Risultato" Then
                TextBox1.Text = ""
                Segno = "-"
            Else

                Segno = "-"
                If Risultato = 0 Then
                    Risultato = CDbl(TextBox1.Text)
                Else
                    Risultato = Risultato - CDbl(TextBox1.Text)
                End If
                TextBox1.Text = ""
            End If
        Catch ex As Exception
            MsgBox("operazione impossibile")
        End Try
    End Sub

    Private Sub Button13_Click(sender As Object, e As EventArgs) Handles Button13.Click
        Try
            If Segno = "Risultato" Then
                TextBox1.Text = ""
                Segno = "*"
            Else

                Segno = "*"
                If Risultato = 0 Then
                    Risultato = CDbl(TextBox1.Text)
                Else
                    Risultato = Risultato * CDbl(TextBox1.Text)
                End If
                TextBox1.Text = ""
            End If
        Catch ex As Exception
            MsgBox("operazione impossibile")
        End Try
    End Sub

    Private Sub Button14_Click(sender As Object, e As EventArgs) Handles Button14.Click
        Try
            If Segno = "Risultato" Then
                TextBox1.Text = ""
                Segno = ":"
            Else

                Segno = ":"
                If Risultato = 0 Then
                    Risultato = CDbl(TextBox1.Text)
                Else
                    Risultato = Risultato / CDbl(TextBox1.Text)
                End If
                TextBox1.Text = ""
            End If
        Catch ex As Exception
            MsgBox("operazione impossibile")
        End Try
    End Sub

    Private Sub Button15_Click(sender As Object, e As EventArgs) Handles Button15.Click
        Try
            If Segno = "+" Then
                Risultato = Risultato + CDbl(TextBox1.Text)
            ElseIf Segno = "-" Then
                Risultato = Risultato - CDbl(TextBox1.Text)
            ElseIf Segno = "*" Then
                Risultato = Risultato * CDbl(TextBox1.Text)
            ElseIf Segno = ":" Then
                Risultato = Risultato / CDbl(TextBox1.Text)
            End If
            Segno = "Risultato"
            TextBox1.Text = Risultato
        Catch ex As Exception
            MsgBox("operazione impossibile")
        End Try
    End Sub
End Class
